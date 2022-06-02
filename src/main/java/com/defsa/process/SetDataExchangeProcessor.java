package com.defsa.process;




import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class SetDataExchangeProcessor implements Processor{

	@Override
	public void process(Exchange exchange) throws Exception {
		// TODO Auto-generated method stub
		System.out.print("Body In = "+exchange.getIn().getBody());
		exchange.getMessage().setBody("Body definido a partir del process");
		exchange.getMessage().setHeader("Cabecera1","cabecera establecida en process");
	}

}
