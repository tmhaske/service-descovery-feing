package com.tm.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.tm.dto.ErrorResponse;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	  @ExceptionHandler(Exception.class)
	    public ResponseEntity<ErrorResponse> handleResourceNotFound(Exception ex) {
	        ErrorResponse error = new ErrorResponse("Resource Not Found", ex.getMessage(),false);
	        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
	    }
	

}
