package com.equisoft.plan.sdk.models;

@javax.annotation.processing.Generated(value = "com.equisoft.openapi.generator.micronaut.MicronautClientGenerator", date = "2021-08-26T14:44:43.637536-04:00[America/Toronto]")

@io.micronaut.core.annotation.Introspected
public class V1CopyFnaResponse {

	public static final String JSON_PROPERTY_STATUS = "status";
	public static final String JSON_PROPERTY_DATA = "data";

	@javax.validation.constraints.NotNull
	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_STATUS)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS)
	private java.lang.String status;

	@javax.validation.Valid
	@javax.validation.constraints.NotNull
	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_DATA)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS)
	private V1CopyFnaResponseData data;


	// methods

	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (object == null || getClass() != object.getClass()) {
			return false;
		}
		V1CopyFnaResponse other = (V1CopyFnaResponse) object;
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
				.append("V1CopyFnaResponse[")
				.append("status=").append(status).append(",")
				.append("data=").append(data)
				.append("]")
				.toString();
	}

	// fluent

	public V1CopyFnaResponse status(java.lang.String newStatus) {
		this.status = newStatus;
		return this;
	}

	public java.lang.String status() {
		return status;
	}

	public V1CopyFnaResponse data(V1CopyFnaResponseData newData) {
		this.data = newData;
		return this;
	}

	public V1CopyFnaResponseData data() {
		return data;
	}


	// getter/setter
	public java.lang.String getStatus() {
		return status;
	}

	public V1CopyFnaResponse setStatus(java.lang.String newStatus) {
		this.status = newStatus;
		return this;
	}


	public V1CopyFnaResponseData getData() {
		return data;
	}

	public V1CopyFnaResponse setData(V1CopyFnaResponseData newData) {
		this.data = newData;
		return this;
	}




    
}

