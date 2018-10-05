package com.learncamel.eip.recipientlisteip;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class RecipientEIPProcessor implements Processor {

	public void process(Exchange exchange) throws Exception {
		String employeeType =
                exchange.getIn().getHeader("type", String.class);
        if (employeeType.equals("senior")) {
            exchange.getIn().setHeader("type", "file:xmlsenior");
        } else {
            exchange.getIn().setHeader("type", "file:xmljunior");

        }
	}

}
