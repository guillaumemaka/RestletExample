package com.restletexample;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("easy")
public class RootResource {
	@GET
    @Produces("text/html")
    public String getHtml() {
        return "<html><head></head><body>\n"
                + "This is an easy resource (as html text).\n"
                + "</body></html>";
    }

    @GET
    @Produces("text/plain")
    public String getPlain() {
        return "This is an easy resource (as plain text)";
    }
}
