package com.mandarinaSolutions.impresiones3d.exceptionHandlers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import com.mandarinaSolutions.impresiones3d.errors.HttpError;
import com.mandarinaSolutions.impresiones3d.exceptions.HttpConflictExist;
import com.mandarinaSolutions.impresiones3d.exceptions.HttpNotFoundException;


@ControllerAdvice
public class RestControllerExceptionHAndler{
	
	@ExceptionHandler(HttpNotFoundException.class)
	public ResponseEntity<HttpError> handleNotFoundByID() {
		HttpError error = new HttpError(404, "No existe articulo con ese ID");
		return new ResponseEntity<HttpError>(error, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(HttpConflictExist.class)
	public ResponseEntity<HttpError> handleExist() {
		HttpError error = new HttpError(409, "Ya existe articulo con ese ID");
		return new ResponseEntity<HttpError>(error, HttpStatus.CONFLICT);
	}
	

//	@ResponseStatus(value=HttpStatus.CONFLICT, reason="No existe articulo con ese ID")
//	@ExceptionHandler(HttpNotFoundException.class)
//	public void handleNotFoundByID() {}
	
}