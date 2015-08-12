package net.schwabe.training;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.codahale.metrics.annotation.Timed;

@Path(value = "/addthis")
@Produces(value = MediaType.APPLICATION_JSON)
public class AdditionResource {

    private final TrainingConfig conf;

    public AdditionResource(TrainingConfig conf) {
        this.conf = conf;
    }

    @GET
    @Timed
    public AdditionResponse addTheseNumbers(@QueryParam("num1") int num1, @QueryParam("num2") int num2) {
        return new AdditionResponse(num1 + num2);
    }

}
