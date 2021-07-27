package com.customeexception.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.HttpClientErrorException.BadRequest;

import com.customeexception.dto.ExceptionResponse;
import com.customeexception.dto.ExceptionResponseChild;

/**
 * Globally Manage to exception wise sent response
 * 
 * @author Purv Patel
 *
 */
@RestControllerAdvice
public class GlobalCustomeException {

	@ExceptionHandler(CustomeExceptionHandler.class)
	public ResponseEntity<ExceptionResponse> handleCustomException(HttpServletRequest request,
			CustomeExceptionHandler e) {
		return ResponseEntity.status(e.getStatusCode())
				.body(new ExceptionResponse(
						new ExceptionResponseChild(request.getServletPath(), e.getStatusCode().name()), e.getMessage(),
						e.getStatusCode().value()));
	}

	@ExceptionHandler({ BadRequest.class, NullPointerException.class })
	public ResponseEntity<ExceptionResponse> handleBadREquest(HttpServletRequest request, BadRequest e) {
		System.out.println("Exception Throw With this API : " + request.getServletPath());
		HttpStatus status = HttpStatus.BAD_REQUEST;
		return ResponseEntity.status(status)
				.body(new ExceptionResponse(
						new ExceptionResponseChild(request.getServletPath(), e.getStatusCode().name()), e.getMessage(),
						e.getStatusCode().value()));
	}

	@ExceptionHandler(NumberFormatException.class)
	public ResponseEntity<ExceptionResponse> handleNumberFormate(HttpServletRequest request, NumberFormatException e) {
		System.out.println("Exception Throw With this API : " + request.getServletPath());
		HttpStatus status = HttpStatus.BAD_REQUEST;
		return ResponseEntity.status(status).body(new ExceptionResponse(
				new ExceptionResponseChild(request.getServletPath(), status.name()), e.getMessage(), status.value()));
	}

}
