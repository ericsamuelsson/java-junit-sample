package com.ibm.cloudoe.samples.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.ibm.cloudoe.samples.HelloResource;

public class HelloResourceTest {

    @Test
    public void getInformation() {
        String informationMessage = new HelloResource().getInformationInternal();
        assertNotNull("No information message set", informationMessage);
        assertTrue("No information message set", !informationMessage.isEmpty());
    }
}