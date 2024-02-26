package com.project.demo.resources.exceptions;

import com.project.demo.services.exception.ResourceNotFoundException;
import jakarta.servlet.http.HttpServletRequest;
import java.time.Instant;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ResourceExceptionHandler extends ResponseEntityExceptionHandler {

  @ExceptionHandler(ResourceNotFoundException.class)
  public ResponseEntity<StandardEror> resourceNotFound(
    ResourceNotFoundException e,
    HttpServletRequest request
  ) {
    String error = "Resource not found";
    HttpStatus status = HttpStatus.NOT_FOUND;
    StandardEror err = new StandardEror(
      Instant.now(),
      status.value(),
      error,
      e.getMessage(),
      request.getRequestURI()
    );
    return ResponseEntity.status(status).body(err);
  }

  @ExceptionHandler(DataIntegrityViolationException.class)
  public ResponseEntity<StandardEror> database(
    DataIntegrityViolationException e,
    HttpServletRequest request
  ) {
    String error = "Database error";
    HttpStatus status = HttpStatus.BAD_REQUEST;
    StandardEror err = new StandardEror(
      Instant.now(),
      status.value(),
      error,
      e.getMessage(),
      request.getRequestURI()
    );
    return ResponseEntity.status(status).body(err);
  }
}
