package com.equisoft.plan.sdk.models;

@javax.annotation.processing.Generated(value = "com.equisoft.openapi.generator.micronaut.MicronautClientGenerator", date = "2022-06-23T05:16:03.417332086Z[Etc/UTC]")

@io.micronaut.core.annotation.Introspected
public class CmdCopyFNAResponse {

	public static final String JSON_PROPERTY_NEW_FNA_UUID = "newFnaUuid";

	/** Uuid of the newly created fna. */
	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_NEW_FNA_UUID)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private @io.micronaut.core.annotation.Nullable java.lang.String newFnaUuid;


	// methods

	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (object == null || getClass() != object.getClass()) {
			return false;
		}
		CmdCopyFNAResponse other = (CmdCopyFNAResponse) object;
		return java.util.Objects.equals(newFnaUuid, other.newFnaUuid);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(newFnaUuid);
	}

	@Override
	public String toString() {
		return new StringBuilder()
				.append("CmdCopyFNAResponse[")
				.append("newFnaUuid=").append(newFnaUuid)
				.append("]")
				.toString();
	}

	// fluent

	public CmdCopyFNAResponse newFnaUuid(@io.micronaut.core.annotation.Nullable java.lang.String newNewFnaUuid) {
		this.newFnaUuid = newNewFnaUuid;
		return this;
	}

	public @io.micronaut.core.annotation.Nullable java.lang.String newFnaUuid() {
		return newFnaUuid;
	}


	// getter/setter
	public @io.micronaut.core.annotation.Nullable java.lang.String getNewFnaUuid() {
		return newFnaUuid;
	}

	public CmdCopyFNAResponse setNewFnaUuid(@io.micronaut.core.annotation.Nullable java.lang.String newNewFnaUuid) {
		this.newFnaUuid = newNewFnaUuid;
		return this;
	}




    
}

