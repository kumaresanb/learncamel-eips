package com.learncamel.eip.wiretap.test;

import java.io.File;

import org.apache.camel.RoutesBuilder;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.Test;

import com.learncamel.eip.wiretap.WireTapRoute;

public class WireTapRouteTest extends CamelTestSupport {
	@Override
	protected RoutesBuilder createRouteBuilder() throws Exception {
		return new WireTapRoute();
	}
	
	@Test
	public void wireTapRoute() throws InterruptedException {
        Thread.sleep(5000);
        File file = new File("all");

        assertTrue(file.isDirectory());

        File fileDebug = new File("debug");

        assertTrue(fileDebug.isDirectory());
	}
}
