package net.schwabe.training;

import java.lang.reflect.Field;

import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class TrainingApp extends Application<TrainingConfig> {

    private static final String API_VERSION = "0.1";
	private static final Logger log = LoggerFactory.getLogger(TrainingApp.class);

	public static void main(String[] args) throws Exception {
        new TrainingApp().run(args);
	}

    public void initialize(Bootstrap<TrainingConfig> bootstrap) {
    }
    
	@Override
	public void run(TrainingConfig conf, Environment env) throws Exception {
	
		// health checks
        env.healthChecks().register("template", new TrainingHealthCheck("Hello, %s!"));

		// our api services 
    	env.jersey().register(new PingResource(conf));				// GET   /ping
    	env.jersey().register(new AdditionResource(conf));			// GET   /addthis?num1=12&num2=44

	}

}
