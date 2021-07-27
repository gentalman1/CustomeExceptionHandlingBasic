package com.customeexception.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.customeexception.dto.RegistrationDTO;
import com.customeexception.dto.ResponseDTO;
import com.customeexception.entity.Registration;
import com.customeexception.enumhelper.ResponseMessage;
import com.customeexception.exception.CustomeExceptionHandler;
import com.customeexception.repository.HomeRepository;

/**
 * @author Purv Patel
 *
 */
@Service
@Transactional(readOnly = true)
public class HomeServiceImpl implements HomeService {

	private HomeRepository homeRepository;

	public HomeServiceImpl(HomeRepository homeRepository) {
		super();
		this.homeRepository = homeRepository;
	}

	@Override
	public Object addDetails(RegistrationDTO registrationDto) {
		Registration registration = null;
		if (registrationDto.getEmail() == null || registrationDto.getEmail().isEmpty()) {
			throw new CustomeExceptionHandler("Email id Must not null or empty", HttpStatus.BAD_REQUEST);
		} else {
			if (registrationDto.getId() != null) {
				registration = new Registration(registrationDto.getId(), registrationDto.getName(),
						registrationDto.getEmail(), registrationDto.getPhoneNo());
			} else {
				registration = new Registration(registrationDto.getName(), registrationDto.getEmail(),
						registrationDto.getPhoneNo());
			}
			registration = homeRepository.save(registration);
			return ResponseEntity.ok().body(
					new ResponseDTO(registration, ResponseMessage.DATA_ADD_SUCCESSFULLY.getMessage(), HttpStatus.OK));
		}
	}

	@Override
	public Object getAllDetails() {
		return ResponseEntity.ok().body(new ResponseDTO(homeRepository.findAll(),
				ResponseMessage.DATA_OBTAINED_SUCCESSFULLY.getMessage(), HttpStatus.OK));
	}

}
