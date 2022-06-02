package com.defsa.process;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class ProcessDataExchangeProcessor implements Processor{

	@Override
	public void process(Exchange exchange) throws Exception {
		// TODO Auto-generated method stub
		System.out.print("2. Body in"+exchange.getIn().getBody());
		System.out.println("2. Cabecera1."+exchange.getIn().getHeader("Cabecera1"));
	}

}
