package net.javaguides.springboot.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {

	private String resourcName;
	private String fieldName;
	private Object fieldValue;
	
	public ResourceNotFoundException(String resourcName, String fieldName, Object fieldValue) {
		super(String.format("%s not found with %s : '%s'", resourcName, fieldName, fieldValue));
		this.resourcName = resourcName;
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}
	
	public String getResourcName() {
		return resourcName;
	}
	
	public String getFieldName() {
		return fieldName;
	}
	
	public Object getFieldValue() {
		return fieldValue;
	}

}
