package com.kovitad.services;

import java.util.ArrayList;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import org.springframework.stereotype.Component;
import com.opensymphony.xwork2.util.logging.Logger;
import com.opensymphony.xwork2.util.logging.LoggerFactory;

import com.kovitad.domain.Product;

@WebService(serviceName="SearchProductWs")
@SOAPBinding(style=Style.RPC)
@Component(value="productSearchingService")
public class ProductWebServiceExample {
	
	Logger logger = LoggerFactory.getLogger(ProductWebServiceExample.class);
	
	private static List<Product> products = new ArrayList<>();
	
	static {
		products.add(new Product("Product A", "http://kovitad.com/A.jgp", null));
		products.add(new Product("Product B", "http://kovitad.com/B.jgp", null));
		products.add(new Product("Product C", "http://kovitad.com/C.jgp", null));
	}
	
	
	@WebMethod(operationName="searchProduct")
	public List<Product> listAll(){
		return products;
	}
}
