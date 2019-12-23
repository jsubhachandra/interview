package com.taxi.service;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=ServiceImpl.class)
public class ServiceImplTest {

    private Service service = new ServiceImpl();
	
	@Test
	public void saveDriverTest() {
		service.saveDriver("abc@gmail.com", "subha","chandra","8792729749");
	}


}
