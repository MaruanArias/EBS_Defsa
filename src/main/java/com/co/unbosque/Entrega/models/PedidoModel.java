package com.co.unbosque.Entrega.models;

import javax.persistence.*;

@Entity
@Table(name = "pedido")
public class PedidoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Integer id;

    private String nombreDestinatario;
    private String formaEntrega;
    private String ciudadEntrega;
    private String telefonoEntrega;
    private Integer idLibro;
    
    
	public String getNombreDestinatario() {
		return nombreDestinatario;
	}
	public void setNombreDestinatario(String nombreDestinatario) {
		this.nombreDestinatario = nombreDestinatario;
	}
	public String getFormaEntrega() {
		return formaEntrega;
	}
	public void setFormaEntrega(String formaEntrega) {
		this.formaEntrega = formaEntrega;
	}
	public String getCiudadEntrega() {
		return ciudadEntrega;
	}
	public void setCiudadEntrega(String ciudadEntrega) {
		this.ciudadEntrega = ciudadEntrega;
	}
	public String getTelefonoEntrega() {
		return telefonoEntrega;
	}
	public void setTelefonoEntrega(String telefonoEntrega) {
		this.telefonoEntrega = telefonoEntrega;
	}
	public Integer getIdLibro() {
		return idLibro;
	}
	public void setIdLibro(Integer idLibro) {
		this.idLibro = idLibro;
	}
}
