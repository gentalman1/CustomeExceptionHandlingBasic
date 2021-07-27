package com.customeexception.service;

import com.customeexception.dto.RegistrationDTO;

/**
 * @author Purv Patel
 *
 */
public interface HomeService {

	Object addDetails(RegistrationDTO registrationDto);

	Object getAllDetails();

}
