package com.imran;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.imran.model.Product;
import com.imran.service.JewelleryShopService;

@ContextConfiguration(classes = { AppMain.class })
@RunWith(SpringRunner.class)
public class DroolServiceTest {

	@Autowired
	private JewelleryShopService jewelleryShopService;
	
	Product productObj = null;
 
	@Before
	public void setUp(){
		productObj = new Product();
		productObj.setType("other");
	}

	
	
	@Test
	public void testDiscount() throws Exception {
		Product poduct = jewelleryShopService.getProductDiscount(productObj);
		assertEquals(20,poduct.getDiscount());
	}
	

}
