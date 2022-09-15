package com.example.RewardDetails.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class RewardDetailsExceptionHandler extends ResponseEntityExceptionHandler {

	
	@ExceptionHandler
    public ResponseEntity<String> handle(Exception ex) {
		return  new ResponseEntity<String>("Technical error occured while calculating reward points",HttpStatus.INTERNAL_SERVER_ERROR);
       
    }
}
