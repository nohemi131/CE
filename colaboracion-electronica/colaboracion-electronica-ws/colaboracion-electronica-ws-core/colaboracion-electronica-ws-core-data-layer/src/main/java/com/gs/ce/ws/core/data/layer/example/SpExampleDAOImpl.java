package com.gs.ce.ws.core.data.layer.example;


import oracle.jdbc.OracleTypes;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import com.gs.ce.commons.utilities.time.TimeUtil;
import com.gs.ce.commons.utilities.ws.constants.Constants;
import com.gs.ce.ws.core.data.interfaces.example.ISpExampleDAO;
import com.gs.ce.ws.core.entities.data.example.Example;
import com.gs.ce.ws.core.entities.services.example.RequestExampleTO;



@Repository
public class SpExampleDAOImpl extends Constants implements ISpExampleDAO{
	
	private static Logger log= Logger.getLogger(SpExampleDAOImpl.class.getName());
			

	@Autowired
	private DataSource dataSource;
	
	private SimpleJdbcCall spExample;
	
	   
	@PostConstruct
	public void init(){	     
	    log.info("SpExampleDAOImpl.init()");
	  
	    this.spExample = new SimpleJdbcCall(this.dataSource)
	    .withSchemaName(SCHEMA)
	    .withProcedureName("SP_EXAMPLE")
	    .withoutProcedureColumnMetaDataAccess()
	    .declareParameters(new SqlParameter("PC_USER", OracleTypes.VARCHAR),	    		
	    				   new SqlParameter("PC_PASS", OracleTypes.VARCHAR),
	    				  //Out Parameters	
			   			  new SqlOutParameter("PI_CODE",OracleTypes.INTEGER),
			   			  new SqlOutParameter("PC_MESSAGE",OracleTypes.VARCHAR),
	    				  new SqlOutParameter("PC_RETURN1",OracleTypes.VARCHAR));

	}
	
	
	
	@Override
	public Example invokeSpExample(RequestExampleTO requestExampleTO) throws Exception {		
		Example example = new Example() ;
		double startTime = System.nanoTime();
		MapSqlParameterSource map = new MapSqlParameterSource();
		Map<?, ?> out = null;
		try {
			log.info(" SP Example: "+requestExampleTO.toString() );
			map.addValue("PC_USER", requestExampleTO.getUser(), OracleTypes.VARCHAR);
			map.addValue("PC_PASS", requestExampleTO.getPass(), OracleTypes.VARCHAR);
			out=this.spExample.execute(map);
			log.info(" Code: "+out.get("PI_CODE") +" Message: "+ out.get("PC_MESSAGE"));
			example.setCode((int)out.get("PI_CODE"));
			example.setMessage((String) out.get("PC_MESSAGE"));			
			if(example.getCode() == 0) {
				example.setReturn1((String) out.get("PC_RETURN1"));
			}
		
		} catch (Throwable ex) {
			log.error("Mensaje Error " +ex.fillInStackTrace(),ex);
			example.setCode(-1);
			example.setMessage(ex.getMessage());
		}
		
		double elapsedTime = TimeUtil.getElapsedTime(startTime);
		log.info("Store ejecutado:{  "+SCHEMA+"SP_EXAMPLE" +elapsedTime+ " ms");
		return example;
	}	
}