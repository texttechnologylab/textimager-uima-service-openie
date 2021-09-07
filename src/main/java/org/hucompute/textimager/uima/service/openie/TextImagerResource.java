package org.hucompute.textimager.uima.service.openie;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/textimager")
public class TextImagerResource {
    @GET
    @Path("/ready")
    @Produces(MediaType.APPLICATION_JSON)
    public TextImagerReadyResponse ready() {
        TextImagerReadyResponse response = new TextImagerReadyResponse();
        response.ready = true;
        return response;
    }
}
