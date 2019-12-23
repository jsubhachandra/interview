package com.codersfirst.interview;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.taxi.service.Service;

@Controller
public class TaxiController {
	private static final Logger LOGGER = LogManager.getLogger(TaxiController.class);

	@Autowired
	Service service;

	@RequestMapping(value = "/saveDriver", method = RequestMethod.POST)
	public String saveDriver(@RequestBody String json) {
		LOGGER.info("---->saveDriver in RegisterController "+json);
		//JSONObject jObject = new JSONObject(json);
		//service.saveDriver(email,name,uname,phone);
		LOGGER.info("<------saveDriver in RegisterController");
		return "success";
	}
}
