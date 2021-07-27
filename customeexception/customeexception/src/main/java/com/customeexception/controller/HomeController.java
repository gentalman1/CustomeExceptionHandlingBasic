package com.customeexception.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.customeexception.dto.RegistrationDTO;
import com.customeexception.exception.CustomeExceptionHandler;
import com.customeexception.service.HomeService;

/**
 * This is restcontroller for demo purpose and also used the constructor
 * injection
 * 
 * @author Purv Patel
 *
 */
@RestController
@RequestMapping("/home")
public class HomeController {
	private HomeService homeService;

	public HomeController(HomeService homeService) {
		this.homeService = homeService;
	}

	@PostMapping("/add")
	public Object addDetails(@RequestBody RegistrationDTO registrationDto) {
		return homeService.addDetails(registrationDto);
	}

	@GetMapping("/getAll")
	public Object getAllDetails() {
		return homeService.getAllDetails();
	}

	@GetMapping("/checkValue")
	public Object checkValue(@RequestParam Long price) {
		if (price > 20000) {
			throw new CustomeExceptionHandler("price must be less than the 20000", HttpStatus.BAD_REQUEST);
		}
		return price;
	}
}
