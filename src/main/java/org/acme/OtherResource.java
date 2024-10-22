
package org.acme;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.slf4j.Logger;

@Path("/other")
public class OtherResource {

    Logger log = org.slf4j.LoggerFactory.getLogger(OtherResource.class);

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        log.info("tested using quarkus test");
        return "Hello from Quarkus REST";
    }

}
