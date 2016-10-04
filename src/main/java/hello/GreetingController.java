package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("")
@Controller
public class GreetingController {
    @Autowired
    private Greeting greeting;

    @Path("/greeting")
    @GET
    public String greeting(@DefaultValue("World") @QueryParam("name") String name){
        return greeting.greeting(name);
    }

}