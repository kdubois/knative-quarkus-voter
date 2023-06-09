package com.kevindubois.knativequarkusvoter.client;

import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import com.kevindubois.knativequarkusvoter.model.Vote;

@ApplicationScoped
@Path("/getresults")
@RegisterRestClient(configKey="processor-api")
public interface ProcessorRestClient {
    @GET
    List<Vote> getVotes();
}
