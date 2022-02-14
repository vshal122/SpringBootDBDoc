package com.rakuten.StudentApp.Advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.rakuten.StudentApp.Service.BusinessException;
import com.rakuten.StudentApp.Service.ExceptionResponse;
import com.rakuten.StudentApp.Service.ServerError;

@RestControllerAdvice
public class ControllerAdvice {

	   @ResponseStatus(value = HttpStatus.BAD_REQUEST)
	   @ExceptionHandler(BusinessException.class)
	   public ExceptionResponse  HandlerError (BusinessException b)
	   {
		   ExceptionResponse response = new ExceptionResponse();
		   response.setErrorMessage(b.getMessage());
		   response.setErrorCode(HttpStatus.BAD_REQUEST.toString());
		   return response;
	   }
	   
	   @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	   @ExceptionHandler(ServerError.class)
	   public ExceptionResponse  internalServerError (BusinessException b)
	   {
		   ExceptionResponse response = new ExceptionResponse();
		   response.setErrorMessage(b.getMessage());
		   response.setErrorCode(HttpStatus.INTERNAL_SERVER_ERROR.toString());
		   return response;
	   }
	   
	   @ExceptionHandler(HttpMessageNotReadableException.class)
	   public ResponseEntity<Object> httpmsgNotReadable(HttpMessageNotReadableException h)
	   {
		  return new ResponseEntity<Object>("Please fill Correct details",HttpStatus.BAD_REQUEST);		   
	   }
	   
}



