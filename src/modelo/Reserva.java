package modelo;

import java.sql.Date;
import java.time.LocalDate;

public class Reserva {
	private Integer id;
	private Date dataE;
	private Date dataS;
	private Double valor;
	private String formaPago;
	
	public Reserva(Date fechaE, Date fechaS, Double valor, String formaPago) {
		super();
		this.dataE = fechaE;
		this.dataS = fechaS;
		this.valor = valor;
		this.formaPago = formaPago;
	}
	
	public Reserva(Integer id, Date dataE, Date dataS, Double valor, String formaPago) {
		super();
		this.id = id;
		this.dataE = dataE;
		this.dataS = dataS;
		this.valor = valor;
		this.formaPago = formaPago;
	}
	
	
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDataE() {
		return dataE;
	}

	public void setDataE(Date dataE) {
		this.dataE = dataE;
	}

	public Date getDataS() {
		return dataS;
	}

	public void setDataS(Date dataS) {
		this.dataS = dataS;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getFormaPago() {
		return formaPago;
	}

	public void setFormaPago(String formaPago) {
		this.formaPago = formaPago;
	}
	
	

}
