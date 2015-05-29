package com.shooter.api;

import com.sun.jersey.api.client.ClientResponse;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("myresource")
public class v1API {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "application/json" media type.
     *
     * @return String that will be returned as a application/json response.
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getIt() {
        return "{\"status\": \"success\"}";
    }
    
    @GET @Path("forbid")
    @Produces(MediaType.APPLICATION_JSON)
    public Response get403() {
        return Response.status(ClientResponse.Status.FORBIDDEN).build();
    }
}
