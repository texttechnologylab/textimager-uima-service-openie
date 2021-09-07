package org.hucompute.textimager.uima.service.openie;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/openie")
public class OpenIeResource {
    @Inject
    OpenIeService openIeService;

    @POST
    @Path("/process")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public OpenIeResponse process(@NotNull @Valid final OpenIeRequest request) {
        OpenIeResponse response = new OpenIeResponse();
        response.extractions = openIeService.extract(request.text);
        return response;
    }
}
