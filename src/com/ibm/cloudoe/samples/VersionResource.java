package com.ibm.cloudoe.samples;

import java.io.InputStream;
import java.util.Scanner;

import javax.ws.rs.GET;
import javax.ws.rs.Path;


@Path("/version")
public class VersionResource {

    public String getApplicationVersion() {
        InputStream input = getClass().getResourceAsStream("/VERSION");
        Scanner s = null;
        try {
            s = new Scanner(input,"UTF-8").useDelimiter("\\A");
            if (s.hasNext()) {
                String version = s.next();
                return version;
            }
            return null;
        } catch (Exception e) {
            return null;
        } finally {
            if (s != null) {
                s.close();
            }
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