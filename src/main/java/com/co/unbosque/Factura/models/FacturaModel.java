package com.co.unbosque.Factura.models;

import javax.persistence.*;
@Entity
@Table(name ="factura")
public class FacturaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)

    private Integer id;
    private String cod_cliente;
    private String cod_libro;
    private String formaPago;
    private boolean estado;
    private Integer costo;

    public Integer getId() {
            return id;
        }
    public void setId(Integer id) {
            this.id = id;
        }
    public String getCod_cliente() {
            return cod_cliente;
        }
     public void setCod_cliente(String cod_cliente) {
            this.cod_cliente = cod_cliente;
        }
    public String getCod_libro() {
            return cod_libro;
        }
    public void setCod_libro(String cod_libro) {
            this.cod_libro = cod_libro;
        }
    public String getFormaPago() {
            return formaPago;
        }
    public void setFormaPago(String formaPago) {
            this.formaPago = formaPago;
        }
    public boolean isEstado() {
            return estado;
        }
    public void setEstado(boolean estado) {
            this.estado = estado;
        }
    public Integer getCosto() {
            return costo;
        }
    public void setCosto(Integer costo) {
            this.costo = costo;
        }
}
