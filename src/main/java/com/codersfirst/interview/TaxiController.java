package com.codersfirst.interview;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.taxi.service.Service;
import com.taxi.service.ServiceImpl;

@RestController
public class TaxiController {
	private static final Logger LOGGER = LogManager.getLogger(TaxiController.class);

	Service service = new ServiceImpl();

	@RequestMapping(value = "/saveDriver", method = RequestMethod.POST)
	public String saveDriver(@RequestBody String json) {
		LOGGER.info("---->saveDriver in RegisterController "+json);
		//JSONObject jObject = new JSONObject(json);
		//service.saveDriver(email,name,uname,phone);
		LOGGER.info("<------saveDriver in RegisterController");
		return "success";
	}
}
