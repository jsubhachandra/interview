package com.taxi.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.taxi.vo.DriverVO;

@org.springframework.stereotype.Service
public class ServiceImpl implements Service{

	
	private static final Logger LOGGER = LogManager.getLogger(ServiceImpl.class);
	
	List<DriverVO> list = new ArrayList<DriverVO>();
	
	public String saveDriver(String email,String name,String uname,String phone){
		
		LOGGER.info("---->saveDriver in ServiceImpl");
		DriverVO driver = new DriverVO();
		driver.setEmail(email);
		driver.setName(name);
		driver.setUname(uname);
		driver.setPhone(phone);
		
		list.add(driver);
		System.out.println(list);
		LOGGER.info("<----saveDriver in ServiceImpl");
		return "success";
	}

}
