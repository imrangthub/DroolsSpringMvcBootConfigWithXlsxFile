package com.imran.service;

import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.imran.model.Product;

@Service
public class JewelleryShopService {
	
	@Autowired
	private KieSession kieSession;


	public Product getProductDiscount(Product product) {
		kieSession.insert(product);
		int result = kieSession.fireAllRules();
		
		System.out.println("Kie Session:"+result);
		
		System.out.println(product);
		//kieSession.dispose();
		return product;
	}


}