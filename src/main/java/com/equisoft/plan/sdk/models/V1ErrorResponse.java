package com.equisoft.plan.sdk.models;

@javax.annotation.processing.Generated(value = "com.equisoft.openapi.generator.micronaut.MicronautClientGenerator", date = "2022-01-13T19:31:48.381750Z[Etc/UTC]")

@io.micronaut.core.annotation.Introspected
public class V1ErrorResponse {

	public static final String JSON_PROPERTY_STATUS = "status";
	public static final String JSON_PROPERTY_DATA = "data";

	@javax.validation.constraints.NotNull
	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_STATUS)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS)
	private java.lang.String status;

	@javax.validation.Valid
	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_DATA)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private @io.micronaut.core.annotation.Nullable V1ErrorResponseData data;


	// methods

	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (object == null || getClass() != object.getClass()) {
			return false;
		}
		V1ErrorResponse other = (V1ErrorResponse) object;
		return java.util.Objects.equals(status, other.status)
				&& java.util.Objects.equals(data, other.data);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(status, data);
	}

	@Override
	public String toString() {
		return new StringBuilder()
				.append("V1ErrorResponse[")
				.append("status=").append(status).append(",")
				.append("data=").append(data)
				.append("]")
				.toString();
	}

	// fluent

	public V1ErrorResponse status(java.lang.String newStatus) {
		this.status = newStatus;
		return this;
	}

	public java.lang.String status() {
		return status;
	}

	public V1ErrorResponse data(@io.micronaut.core.annotation.Nullable V1ErrorResponseData newData) {
		this.data = newData;
		return this;
	}

	public @io.micronaut.core.annotation.Nullable V1ErrorResponseData data() {
		return data;
	}


	// getter/setter
	public java.lang.String getStatus() {
		return status;
	}

	public V1ErrorResponse setStatus(java.lang.String newStatus) {
		this.status = newStatus;
		return this;
	}


	public @io.micronaut.core.annotation.Nullable V1ErrorResponseData getData() {
		return data;
	}

	public V1ErrorResponse setData(@io.micronaut.core.annotation.Nullable V1ErrorResponseData newData) {
		this.data = newData;
		return this;
	}




    
}

