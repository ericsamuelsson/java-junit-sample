package com.ibm.cloudoe.samples;

import javax.ws.rs.GET;
import javax.ws.rs.Path;


@Path("/version")
public class VersionResource {

    public String getApplicationVersion() {
        return System.getenv("APP_VERSION");
    }

    @GET
	public String getVersion() {
		return getApplicationVersion();
	}
}