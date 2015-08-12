package net.schwabe.training;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;

public class TrainingConfig extends Configuration {

    @JsonProperty("pingresponse")
    public String pingresponse;

    @JsonProperty("dbhost")
    public String dbhost;

    @JsonProperty("dbport")
    public String dbport;

    @JsonProperty("env")
    public String env;
	
}
