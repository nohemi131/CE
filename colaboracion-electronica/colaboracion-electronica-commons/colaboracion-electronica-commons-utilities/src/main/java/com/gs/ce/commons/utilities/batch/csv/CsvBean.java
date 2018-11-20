package com.gs.ce.commons.utilities.batch.csv;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.gs.ce.ws.core.entities.annotation.CsvAtributte;
import com.gs.ce.ws.core.entities.annotation.CsvClass;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.HeaderColumnNameTranslateMappingStrategy;


@Component
public class CsvBean {

	private static Logger log = Logger.getLogger(CsvBean.class.getName());
	
	
	@SuppressWarnings({ "unchecked", "deprecation" })
	public <T> List<T> convertCsvBean(List<String> keys, T o, File [] files ) {
		
		FileReader fileReader = null;
		CSVReader reader = null;
		log.info("CsvBean.convertCsvBean()");
		log.info("files: " +  files.length);
		List<T> list = new ArrayList<T>();
		try {
			HeaderColumnNameTranslateMappingStrategy<T> beanStrategy = new HeaderColumnNameTranslateMappingStrategy<T>();
			beanStrategy.setType((Class<T>) o.getClass());
			Map<String, String> columnMapping = new HashMap<String, String>();

			int i=0;
			for (String columnName:columnsObject(o.getClass())) {
				columnMapping.put(keys.get(i), columnName);
				i++;
			}

			CsvToBean<T> csvToBean = new CsvToBean<T>();
			beanStrategy.setColumnMapping(columnMapping);
			for (File file:files) {
				try{
				 fileReader = new FileReader(file);
				 reader = new CSVReader(fileReader);
				list.addAll(csvToBean.parse(beanStrategy, reader));
				} catch (Exception e) {
					log.error("Message Error " +e.fillInStackTrace());
				}
				finally{
					 if (reader != null) {
					      try{
					    	  reader.close();
					      }catch (IOException e) {
					          log.error(e);
					      }
					 }
					      
			         if (fileReader != null) {
					      try{
					    	  fileReader.close();
					      }catch (IOException e) {
					          log.error(e);
					      }
			         }
					      
				}

			}
		} catch (Exception e) {
			log.error("Message Error " +e.fillInStackTrace());
		}

		return list;
	}



	public File createCsv(List<String[]> listElements, File file ){
		log.info("CsvBean.convertCsvBean()");
		CSVWriter fileCsv = null;
		FileWriter fw = null;
		try {
			fw = new FileWriter(file);
			fileCsv = new CSVWriter(fw);
			fileCsv.writeAll(listElements);
			fileCsv.flush();
		} catch (Exception e) {
			log.error("Message Error " +e.fillInStackTrace());
		}
		finally{
			 if (fileCsv != null) {
			      try{
			    	  fileCsv.close();
			      }catch (IOException e) {
			          log.error(e);
			      }
			 }
			 if (fw != null) {
			      try{
			    	  fw.close();
			      }catch (IOException e) {
			          log.error(e);
			      }
			 }
		}
		return file;
	}

	//encontrara la anotaci�n sobre los atributos
	public String[] columnsObject(Class<?> clazz) {
			String columns[]=null;
			try{

				//anotacion principal de clase
				Annotation[] annotations = clazz.getAnnotations();

				for(Annotation annotation:annotations ){
				   if (annotation instanceof CsvClass ) {
					   CsvClass csvClass= (CsvClass)annotation;
					   columns=new String[csvClass.elements()];
					}else if (annotation instanceof  CsvClass) {
						CsvClass csvClass= (CsvClass)annotation;
					   columns=new String[csvClass.elements()];
					}
				   
				  
				}

				//obtener todos los atributos para posteriormente filtrar por anotacion
				Field[] fields = clazz.getDeclaredFields();
				for (Field field : fields) {
					if (field.isAnnotationPresent(CsvAtributte.class)) {
						if(columns!= null){
						columns[field.getAnnotation(CsvAtributte.class).column()]= field.getName();
						}
					}else if (field.isAnnotationPresent(CsvAtributte.class)) {
						if(columns!= null){
						columns[field.getAnnotation(CsvAtributte.class).column()]= field.getName();
						}
					}
				}
			}catch(Throwable e){
				log.error("Message Error " +e.fillInStackTrace());
			}

			return columns;
		}
	
	
	@SuppressWarnings({ "unchecked", "deprecation" })
	public <T> List<T> convertFileCsvBean(List<String> keys, T o, File file ) {
		log.info("CsvBean.convertCsvBean()");

		List<T> list = new ArrayList<T>();
		try {
			HeaderColumnNameTranslateMappingStrategy<T> beanStrategy = new HeaderColumnNameTranslateMappingStrategy<T>();
			beanStrategy.setType((Class<T>) o.getClass());
			Map<String, String> columnMapping = new HashMap<String, String>();

			int i=0;
			for (String columnName:columnsObject(o)) {
				columnMapping.put(keys.get(i), columnName);
				i++;
			}

			CsvToBean<T> csvToBean = new CsvToBean<T>();
			beanStrategy.setColumnMapping(columnMapping);
			
				CSVReader reader = new CSVReader(new FileReader(file));
				list.addAll(csvToBean.parse(beanStrategy, reader));

			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}
	
	//encontrara la anotacion sobre los atributos
	public String[] columnsObject(Object object) {
			String columns[]=null;
			try{

				//anotacion principal de clase
				Annotation[] annotations = object.getClass().getAnnotations();

				for(Annotation annotation:annotations ){
				   if (annotation instanceof CsvClass) {
					   CsvClass csvClass= (CsvClass)annotation;
					   columns=new String[csvClass.elements()];
					}	else if (annotation instanceof  CsvClass) {
						CsvClass csvClass= (CsvClass)annotation;
						   columns=new String[csvClass.elements()];
						}
				}

				//obtener todos los atributos para posteriormente filtrar por anotacion
				Field[] fields = object.getClass().getDeclaredFields();
				for (Field field : fields) {
					if (field.isAnnotationPresent(CsvAtributte.class)) {
						field.setAccessible(true);
						columns[field.getAnnotation(CsvAtributte.class).column()]= field.getName();
					}else if (field.isAnnotationPresent(CsvAtributte.class)) {
						if(columns!= null){
						columns[field.getAnnotation(CsvAtributte.class).column()]= field.getName();
						}
					}
				}
			}catch(Throwable e){
				e.printStackTrace();
			}

			return columns;
		}
}