package com.equisoft.plan.sdk.models;

@javax.annotation.processing.Generated(value = "com.equisoft.openapi.generator.micronaut.MicronautClientGenerator", date = "2022-02-04T18:37:13.594448Z[Etc/UTC]")

@io.micronaut.core.annotation.Introspected
public class ErrorResponse {

	public static final String JSON_PROPERTY_ERROR = "error";
	public static final String JSON_PROPERTY_ERROR_DESCRIPTION = "error_description";
	public static final String JSON_PROPERTY_HINT = "hint";

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_ERROR)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private @io.micronaut.core.annotation.Nullable java.lang.String error;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_ERROR_DESCRIPTION)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_ABSENT)
	private @io.micronaut.core.annotation.Nullable java.lang.String errorDescription;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_HINT)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_ABSENT)
	private @io.micronaut.core.annotation.Nullable java.lang.String hint;


	// methods

	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (object == null || getClass() != object.getClass()) {
			return false;
		}
		ErrorResponse other = (ErrorResponse) object;
		return java.util.Objects.equals(error, other.error)
				&& java.util.Objects.equals(errorDescription, other.errorDescription)
				&& java.util.Objects.equals(hint, other.hint);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(error, errorDescription, hint);
	}

	@Override
	public String toString() {
		return new StringBuilder()
				.append("ErrorResponse[")
				.append("error=").append(error).append(",")
				.append("errorDescription=").append(errorDescription).append(",")
				.append("hint=").append(hint)
				.append("]")
				.toString();
	}

	// fluent

	public ErrorResponse error(@io.micronaut.core.annotation.Nullable java.lang.String newError) {
		this.error = newError;
		return this;
	}

	public @io.micronaut.core.annotation.Nullable java.lang.String error() {
		return error;
	}

	public ErrorResponse errorDescription(@io.micronaut.core.annotation.Nullable java.lang.String newErrorDescription) {
		this.errorDescription = newErrorDescription;
		return this;
	}

	public @io.micronaut.core.annotation.Nullable java.lang.String errorDescription() {
		return errorDescription;
	}

	public ErrorResponse hint(@io.micronaut.core.annotation.Nullable java.lang.String newHint) {
		this.hint = newHint;
		return this;
	}

	public @io.micronaut.core.annotation.Nullable java.lang.String hint() {
		return hint;
	}


	// getter/setter
	public @io.micronaut.core.annotation.Nullable java.lang.String getError() {
		return error;
	}

	public ErrorResponse setError(@io.micronaut.core.annotation.Nullable java.lang.String newError) {
		this.error = newError;
		return this;
	}


	public @io.micronaut.core.annotation.Nullable java.lang.String getErrorDescription() {
		return errorDescription;
	}

	public ErrorResponse setErrorDescription(@io.micronaut.core.annotation.Nullable java.lang.String newErrorDescription) {
		this.errorDescription = newErrorDescription;
		return this;
	}


	public @io.micronaut.core.annotation.Nullable java.lang.String getHint() {
		return hint;
	}

	public ErrorResponse setHint(@io.micronaut.core.annotation.Nullable java.lang.String newHint) {
		this.hint = newHint;
		return this;
	}




    
}

