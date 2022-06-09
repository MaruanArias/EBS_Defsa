
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
    "RestResponse"
})
public class DataFactura {

    @JsonProperty("RestResponse")
    private RestResponse restResponse;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("RestResponse")
    public RestResponse getRestResponse() {
        return restResponse;
    }

    @JsonProperty("RestResponse")
    public void setRestResponse(RestResponse restResponse) {
        this.restResponse = restResponse;
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
