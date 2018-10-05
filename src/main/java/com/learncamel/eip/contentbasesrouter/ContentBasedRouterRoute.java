package com.learncamel.eip.contentbasesrouter;

import org.apache.camel.builder.RouteBuilder;

public class ContentBasedRouterRoute extends RouteBuilder {
	public static final String CAMEl_FILE="CamelFileNameConsumed";
	@Override
	public void configure() throws Exception {
		from("file:input?noop=true").to("log:?level=INFO&showBody=true&showHeaders=true").choice()
				.when(header(CAMEl_FILE).endsWith(".html")).to("file:html")
				.when(header(CAMEl_FILE).endsWith(".txt")).to("file:text")
				.when(header(CAMEl_FILE).endsWith(".json")).to("file:json").otherwise().to("file:other").stop()
				// .to("file:other").stop()
				.end().to("file:all");
	}

}
