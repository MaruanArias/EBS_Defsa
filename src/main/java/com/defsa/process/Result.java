
package com.defsa.process;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

import org.apache.camel.language.simple.types.BinaryOperatorType.ParameterType;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "cod_cliente",
    "cod_libro",
    "formaPago",
    "estado",
    "costo"
})

public class Result {
	
	@JsonProperty("id")
	private Integer id;
    @JsonProperty("cod_cliente")
    private String codCliente;
    @JsonProperty("cod_libro")
    private String codLibro;
    @JsonProperty("formaPago")
    private String formaPago;
    @JsonProperty("estado")
    private Boolean estado;
    @JsonProperty("costo")
   private Integer costo;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("cod_cliente")
    public String getCodCliente() {
        return codCliente;
    }

    @JsonProperty("cod_cliente")
    public void setCodCliente(String codCliente) {
        this.codCliente = codCliente;
    }

    @JsonProperty("cod_libro")
    public String getCodLibro() {
        return codLibro;
    }

    @JsonProperty("cod_libro")
    public void setCodLibro(String codLibro) {
        this.codLibro = codLibro;
    }

    @JsonProperty("formaPago")
    public String getFormaPago() {
        return formaPago;
    }

    @JsonProperty("formaPago")
    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    @JsonProperty("estado")
    public Boolean getEstado() {
        return estado;
    }

    @JsonProperty("estado")
    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    @JsonProperty("costo")
    public Integer getCosto() {
        return costo;
    }

    @JsonProperty("costo")
    public void setCosto(Integer costo) {
        this.costo = costo;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
