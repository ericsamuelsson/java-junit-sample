package com.ibm.cloudoe.samples.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.ibm.cloudoe.samples.VersionResource;

public class VersionResourceTest {

    @Test
    public void getApplicationVersion() {
        String version = new VersionResource().getApplicationVersion();
        assertNotNull("Application version not set", version);
        assertTrue("No information message set", !version.isEmpty());
    }
}