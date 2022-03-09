package com.equisoft.plan.sdk.models;

@javax.annotation.processing.Generated(value = "com.equisoft.openapi.generator.micronaut.MicronautClientGenerator", date = "2022-03-09T19:04:22.810963Z[Etc/UTC]")

@io.micronaut.core.annotation.Introspected
public class V1ErrorResponseData {

	public static final String JSON_PROPERTY_MESSAGE = "message";
	public static final String JSON_PROPERTY_ERROR_KEY = "error_key";

	/** Reason why the query is invalid */
	@javax.validation.constraints.NotNull
	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_MESSAGE)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS)
	private java.lang.String message;

	/** Invalid request error key */
	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_ERROR_KEY)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private @io.micronaut.core.annotation.Nullable java.lang.String errorKey;


	// methods

	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (object == null || getClass() != object.getClass()) {
			return false;
		}
		V1ErrorResponseData other = (V1ErrorResponseData) object;
		return java.util.Objects.equals(message, other.message)
				&& java.util.Objects.equals(errorKey, other.errorKey);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(message, errorKey);
	}

	@Override
	public String toString() {
		return new StringBuilder()
				.append("V1ErrorResponseData[")
				.append("message=").append(message).append(",")
				.append("errorKey=").append(errorKey)
				.append("]")
				.toString();
	}

	// fluent

	public V1ErrorResponseData message(java.lang.String newMessage) {
		this.message = newMessage;
		return this;
	}

	public java.lang.String message() {
		return message;
	}

	public V1ErrorResponseData errorKey(@io.micronaut.core.annotation.Nullable java.lang.String newErrorKey) {
		this.errorKey = newErrorKey;
		return this;
	}

	public @io.micronaut.core.annotation.Nullable java.lang.String errorKey() {
		return errorKey;
	}


	// getter/setter
	public java.lang.String getMessage() {
		return message;
	}

	public V1ErrorResponseData setMessage(java.lang.String newMessage) {
		this.message = newMessage;
		return this;
	}


	public @io.micronaut.core.annotation.Nullable java.lang.String getErrorKey() {
		return errorKey;
	}

	public V1ErrorResponseData setErrorKey(@io.micronaut.core.annotation.Nullable java.lang.String newErrorKey) {
		this.errorKey = newErrorKey;
		return this;
	}




    
}

