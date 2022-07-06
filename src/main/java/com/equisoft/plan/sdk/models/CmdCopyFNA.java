package com.equisoft.plan.sdk.models;

@javax.annotation.processing.Generated(value = "com.equisoft.openapi.generator.micronaut.MicronautClientGenerator", date = "2022-07-06T15:44:07.630547895Z[Etc/UTC]")

@io.micronaut.core.annotation.Introspected
public class CmdCopyFNA {

	public static final String JSON_PROPERTY_FNA_UUID = "fnaUuid";
	public static final String JSON_PROPERTY_USER_EMAIL = "userEmail";
	public static final String JSON_PROPERTY_NEW_PARTICIPANT_UUIDS = "newParticipantUuids";

	/** Uuid of the fna to copy */
	@javax.validation.constraints.NotNull
	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_FNA_UUID)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS)
	private java.lang.String fnaUuid;

	/** Email of the user to which the new FNA should be assigned, default to owner of the FNA */
	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_USER_EMAIL)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_ABSENT)
	private @io.micronaut.core.annotation.Nullable java.lang.String userEmail;

	/** Array of participant UUIDs to modify */
	@javax.validation.Valid
	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_NEW_PARTICIPANT_UUIDS)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private @io.micronaut.core.annotation.Nullable java.util.Map<String, java.lang.String> newParticipantUuids;


	// methods

	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (object == null || getClass() != object.getClass()) {
			return false;
		}
		CmdCopyFNA other = (CmdCopyFNA) object;
		return java.util.Objects.equals(fnaUuid, other.fnaUuid)
				&& java.util.Objects.equals(userEmail, other.userEmail)
				&& java.util.Objects.equals(newParticipantUuids, other.newParticipantUuids);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(fnaUuid, userEmail, newParticipantUuids);
	}

	@Override
	public String toString() {
		return new StringBuilder()
				.append("CmdCopyFNA[")
				.append("fnaUuid=").append(fnaUuid).append(",")
				.append("userEmail=").append(userEmail).append(",")
				.append("newParticipantUuids=").append(newParticipantUuids)
				.append("]")
				.toString();
	}

	// fluent

	public CmdCopyFNA fnaUuid(java.lang.String newFnaUuid) {
		this.fnaUuid = newFnaUuid;
		return this;
	}

	public java.lang.String fnaUuid() {
		return fnaUuid;
	}

	public CmdCopyFNA userEmail(@io.micronaut.core.annotation.Nullable java.lang.String newUserEmail) {
		this.userEmail = newUserEmail;
		return this;
	}

	public @io.micronaut.core.annotation.Nullable java.lang.String userEmail() {
		return userEmail;
	}

	public CmdCopyFNA newParticipantUuids(@io.micronaut.core.annotation.Nullable java.util.Map<String, java.lang.String> newNewParticipantUuids) {
		this.newParticipantUuids = newNewParticipantUuids;
		return this;
	}

	public @io.micronaut.core.annotation.Nullable java.util.Map<String, java.lang.String> newParticipantUuids() {
		return newParticipantUuids;
	}


	// getter/setter
	public java.lang.String getFnaUuid() {
		return fnaUuid;
	}

	public CmdCopyFNA setFnaUuid(java.lang.String newFnaUuid) {
		this.fnaUuid = newFnaUuid;
		return this;
	}


	public @io.micronaut.core.annotation.Nullable java.lang.String getUserEmail() {
		return userEmail;
	}

	public CmdCopyFNA setUserEmail(@io.micronaut.core.annotation.Nullable java.lang.String newUserEmail) {
		this.userEmail = newUserEmail;
		return this;
	}


	public @io.micronaut.core.annotation.Nullable java.util.Map<String, java.lang.String> getNewParticipantUuids() {
		return newParticipantUuids;
	}

	public CmdCopyFNA setNewParticipantUuids(@io.micronaut.core.annotation.Nullable java.util.Map<String, java.lang.String> newNewParticipantUuids) {
		this.newParticipantUuids = newNewParticipantUuids;
		return this;
	}

	public CmdCopyFNA putNewParticipantUuidsItem(String key, java.lang.String newParticipantUuidsItem) {
		if (this.newParticipantUuids == null) {
			this.newParticipantUuids = new java.util.HashMap<>();
		}
		this.newParticipantUuids.put(key, newParticipantUuidsItem);
		return this;
	}



    
}

