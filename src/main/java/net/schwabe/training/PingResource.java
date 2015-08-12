package net.schwabe.training;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.codahale.metrics.annotation.Timed;

@Path(value = "/ping")
@Produces(value = MediaType.APPLICATION_JSON)
public class PingResource {

    private final TrainingConfig conf;

    public PingResource(TrainingConfig conf) {
        this.conf = conf;
    }

    @GET
    @Timed
    public PingResponse giveMeOnePingOnlyPlease() {
        return new PingResponse(conf.pingresponse);
    }

}
