package com.ibm.cloudoe.samples;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.ws.rs.GET;
import javax.ws.rs.Path;


@Path("/version")
public class VersionResource {

    public String getApplicationVersion() {
        byte[] encoded;
        try {
            encoded = Files.readAllBytes(Paths.get("VERSION"));
            return new String(encoded, "UTF-8");
        } catch (IOException e) {
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