package com.equisoft.plan.sdk.models;

@javax.annotation.processing.Generated(value = "com.equisoft.openapi.generator.micronaut.MicronautClientGenerator", date = "2021-08-26T14:44:43.637536-04:00[America/Toronto]")

@io.micronaut.core.annotation.Introspected
public class V1CopyFnaResponseData {

	public static final String JSON_PROPERTY_NEW_FNA_UUID = "new_fna_uuid";

	/** UUID of the newly created FNA */
	@javax.validation.constraints.NotNull
	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_NEW_FNA_UUID)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS)
	private java.lang.String newFnaUuid;


	// methods

	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (object == null || getClass() != object.getClass()) {
			return false;
		}
		V1CopyFnaResponseData other = (V1CopyFnaResponseData) object;
		return java.util.Objects.equals(newFnaUuid, other.newFnaUuid);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(newFnaUuid);
	}

	@Override
	public String toString() {
		return new StringBuilder()
				.append("V1CopyFnaResponseData[")
				.append("newFnaUuid=").append(newFnaUuid)
				.append("]")
				.toString();
	}

	// fluent

	public V1CopyFnaResponseData newFnaUuid(java.lang.String newNewFnaUuid) {
		this.newFnaUuid = newNewFnaUuid;
		return this;
	}

	public java.lang.String newFnaUuid() {
		return newFnaUuid;
	}


	// getter/setter
	public java.lang.String getNewFnaUuid() {
		return newFnaUuid;
	}

	public V1CopyFnaResponseData setNewFnaUuid(java.lang.String newNewFnaUuid) {
		this.newFnaUuid = newNewFnaUuid;
		return this;
	}




    
}

