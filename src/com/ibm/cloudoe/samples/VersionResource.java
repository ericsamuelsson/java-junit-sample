package com.ibm.cloudoe.samples;

import java.io.InputStream;
import java.util.Scanner;

import javax.ws.rs.GET;
import javax.ws.rs.Path;


@Path("/version")
public class VersionResource {

    public String getApplicationVersion() {
        InputStream input = getClass().getResourceAsStream("/VERSION");
        try {
            return new Scanner(input,"UTF-8").useDelimiter("\\A").next();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @GET
	public String getVersion() {
		String version = getApplicationVersion();
		if (version == null || version.isEmpty()) {
		    return "Version not set";
		}
		return version;
	}
}