package com.gs.ce.batch.entities.batch.extraccion;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import org.apache.log4j.Logger;

import com.gs.ce.ws.core.entities.annotation.CsvAtributte;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlTransient;

@SuppressWarnings("unused")
public class ZfiMonitorCE {

	private static final long serialVersionUID = 1L;

	private static Logger log = Logger.getLogger(ZfiMonitorCE.class.getName());
	private String sellerRequestNumber;
	@CsvAtributte(column = 0)
	private String fiEjercicio;
	@CsvAtributte(column = 1)
	private String fcNoSociedad;
	@CsvAtributte(column = 2)
	private String fcNoDocSap;
	@CsvAtributte(column = 3)
	private String fcUsuarioSap;
	@CsvAtributte(column = 4)
	private String fcClaseDocumento;
	@CsvAtributte(column = 5)
	private String fdFechaRegistro;
	@CsvAtributte(column = 6)
	private String fdHoraRegistro;
	@CsvAtributte(column = 7)
	private String fdFechaDocumento;
	@CsvAtributte(column = 8)
	private String fdFechaContabilizacion;
	@CsvAtributte(column = 9)
	private String fcMesContable;
	@CsvAtributte(column = 10)
	private String FnMonedaDoc;
	@CsvAtributte(column = 11)
	private String FnMonedaLocal;
	@CsvAtributte(column = 12)
	private String FcTextoCabecera;
	@CsvAtributte(column = 13)
	private String FcReferenciaCabecera;
	@CsvAtributte(column = 14)
	private String FcIdAnulado;
	@CsvAtributte(column = 15)
	private String FcNoDocAnulado;
	@CsvAtributte(column = 16)
	private String FcNumAcreedor;
	@CsvAtributte(column = 17)
	private String FcNombreAcreedor;
	@CsvAtributte(column = 18)
	private String FnImpMonedaLocal;
	@CsvAtributte(column = 19)
	private String FnImpMonDocumento;
	@CsvAtributte(column = 20)
	private String FcAsignacion;
	@CsvAtributte(column = 21)
	private String FcTextoMovimiento;
	@CsvAtributte(column = 22)
	private String FcIdentificadorFlujo;
	public static Logger getLog() {
		return log;
	}
	public static void setLog(Logger log) {
		ZfiMonitorCE.log = log;
	}
	public String getSellerRequestNumber() {
		return sellerRequestNumber;
	}
	public void setSellerRequestNumber(String sellerRequestNumber) {
		this.sellerRequestNumber = sellerRequestNumber;
	}
	public String getFiEjercicio() {
		return fiEjercicio;
	}
	public void setFiEjercicio(String fiEjercicio) {
		this.fiEjercicio = fiEjercicio;
	}
	public String getFcNoSociedad() {
		return fcNoSociedad;
	}
	public void setFcNoSociedad(String fcNoSociedad) {
		this.fcNoSociedad = fcNoSociedad;
	}
	public String getFcNoDocSap() {
		return fcNoDocSap;
	}
	public void setFcNoDocSap(String fcNoDocSap) {
		this.fcNoDocSap = fcNoDocSap;
	}
	public String getFcUsuarioSap() {
		return fcUsuarioSap;
	}
	public void setFcUsuarioSap(String fcUsuarioSap) {
		this.fcUsuarioSap = fcUsuarioSap;
	}
	public String getFcClaseDocumento() {
		return fcClaseDocumento;
	}
	public void setFcClaseDocumento(String fcClaseDocumento) {
		this.fcClaseDocumento = fcClaseDocumento;
	}
	public String getFdFechaRegistro() {
		return fdFechaRegistro;
	}
	public void setFdFechaRegistro(String fdFechaRegistro) {
		this.fdFechaRegistro = fdFechaRegistro;
	}
	public String getFdHoraRegistro() {
		return fdHoraRegistro;
	}
	public void setFdHoraRegistro(String fdHoraRegistro) {
		this.fdHoraRegistro = fdHoraRegistro;
	}
	public String getFdFechaDocumento() {
		return fdFechaDocumento;
	}
	public void setFdFechaDocumento(String fdFechaDocumento) {
		this.fdFechaDocumento = fdFechaDocumento;
	}
	public String getFdFechaContabilizacion() {
		return fdFechaContabilizacion;
	}
	public void setFdFechaContabilizacion(String fdFechaContabilizacion) {
		this.fdFechaContabilizacion = fdFechaContabilizacion;
	}
	public String getFcMesContable() {
		return fcMesContable;
	}
	public void setFcMesContable(String fcMesContable) {
		this.fcMesContable = fcMesContable;
	}
	public String getFnMonedaDoc() {
		return FnMonedaDoc;
	}
	public void setFnMonedaDoc(String fnMonedaDoc) {
		FnMonedaDoc = fnMonedaDoc;
	}
	public String getFnMonedaLocal() {
		return FnMonedaLocal;
	}
	public void setFnMonedaLocal(String fnMonedaLocal) {
		FnMonedaLocal = fnMonedaLocal;
	}
	public String getFcTextoCabecera() {
		return FcTextoCabecera;
	}
	public void setFcTextoCabecera(String fcTextoCabecera) {
		FcTextoCabecera = fcTextoCabecera;
	}
	public String getFcReferenciaCabecera() {
		return FcReferenciaCabecera;
	}
	public void setFcReferenciaCabecera(String fcReferenciaCabecera) {
		FcReferenciaCabecera = fcReferenciaCabecera;
	}
	public String getFcIdAnulado() {
		return FcIdAnulado;
	}
	public void setFcIdAnulado(String fcIdAnulado) {
		FcIdAnulado = fcIdAnulado;
	}
	public String getFcNoDocAnulado() {
		return FcNoDocAnulado;
	}
	public void setFcNoDocAnulado(String fcNoDocAnulado) {
		FcNoDocAnulado = fcNoDocAnulado;
	}
	public String getFcNumAcreedor() {
		return FcNumAcreedor;
	}
	public void setFcNumAcreedor(String fcNumAcreedor) {
		FcNumAcreedor = fcNumAcreedor;
	}
	public String getFcNombreAcreedor() {
		return FcNombreAcreedor;
	}
	public void setFcNombreAcreedor(String fcNombreAcreedor) {
		FcNombreAcreedor = fcNombreAcreedor;
	}
	public String getFnImpMonedaLocal() {
		return FnImpMonedaLocal;
	}
	public void setFnImpMonedaLocal(String fnImpMonedaLocal) {
		FnImpMonedaLocal = fnImpMonedaLocal;
	}
	public String getFnImpMonDocumento() {
		return FnImpMonDocumento;
	}
	public void setFnImpMonDocumento(String fnImpMonDocumento) {
		FnImpMonDocumento = fnImpMonDocumento;
	}
	public String getFcAsignacion() {
		return FcAsignacion;
	}
	public void setFcAsignacion(String fcAsignacion) {
		FcAsignacion = fcAsignacion;
	}
	public String getFcTextoMovimiento() {
		return FcTextoMovimiento;
	}
	public void setFcTextoMovimiento(String fcTextoMovimiento) {
		FcTextoMovimiento = fcTextoMovimiento;
	}
	public String getFcIdentificadorFlujo() {
		return FcIdentificadorFlujo;
	}
	public void setFcIdentificadorFlujo(String fcIdentificadorFlujo) {
		FcIdentificadorFlujo = fcIdentificadorFlujo;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
