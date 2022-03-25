package com.equisoft.plan.sdk.models;

@javax.annotation.processing.Generated(value = "com.equisoft.openapi.generator.micronaut.MicronautClientGenerator", date = "2022-03-25T20:51:43.174045974Z[Etc/UTC]")

@io.micronaut.core.annotation.Introspected
public class PlansPlan {

	public static final String JSON_PROPERTY_ID = "id";
	public static final String JSON_PROPERTY_TYPE = "type";
	public static final String JSON_PROPERTY_MODIFIED_DATE = "modifiedDate";
	public static final String JSON_PROPERTY_CLIENT_DISPLAY_NAME = "clientDisplayName";
	public static final String JSON_PROPERTY_SPOUSE_DISPLAY_NAME = "spouseDisplayName";
	public static final String JSON_PROPERTY_STATUS = "status";
	public static final String JSON_PROPERTY_STATUS_DATE = "statusDate";
	public static final String JSON_PROPERTY_URL = "url";

	@javax.validation.constraints.NotNull
	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_ID)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS)
	private java.lang.Integer id;

	@javax.validation.constraints.NotNull
	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_TYPE)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS)
	private Type type;

	@javax.validation.constraints.NotNull
	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_MODIFIED_DATE)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS)
	private java.lang.String modifiedDate;

	@javax.validation.constraints.NotNull
	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_CLIENT_DISPLAY_NAME)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS)
	private java.lang.String clientDisplayName;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_SPOUSE_DISPLAY_NAME)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_ABSENT)
	private @io.micronaut.core.annotation.Nullable java.lang.String spouseDisplayName;

	@javax.validation.constraints.NotNull
	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_STATUS)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS)
	private Status status;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_STATUS_DATE)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS)
	private @io.micronaut.core.annotation.Nullable java.lang.String statusDate;

	@javax.validation.constraints.NotNull
	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_URL)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS)
	private java.lang.String url;


	// methods

	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (object == null || getClass() != object.getClass()) {
			return false;
		}
		PlansPlan other = (PlansPlan) object;
		return java.util.Objects.equals(id, other.id)
				&& java.util.Objects.equals(type, other.type)
				&& java.util.Objects.equals(modifiedDate, other.modifiedDate)
				&& java.util.Objects.equals(clientDisplayName, other.clientDisplayName)
				&& java.util.Objects.equals(spouseDisplayName, other.spouseDisplayName)
				&& java.util.Objects.equals(status, other.status)
				&& java.util.Objects.equals(statusDate, other.statusDate)
				&& java.util.Objects.equals(url, other.url);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(id, type, modifiedDate, clientDisplayName, spouseDisplayName, status, statusDate, url);
	}

	@Override
	public String toString() {
		return new StringBuilder()
				.append("PlansPlan[")
				.append("id=").append(id).append(",")
				.append("type=").append(type).append(",")
				.append("modifiedDate=").append(modifiedDate).append(",")
				.append("clientDisplayName=").append(clientDisplayName).append(",")
				.append("spouseDisplayName=").append(spouseDisplayName).append(",")
				.append("status=").append(status).append(",")
				.append("statusDate=").append(statusDate).append(",")
				.append("url=").append(url)
				.append("]")
				.toString();
	}

	// fluent

	public PlansPlan id(java.lang.Integer newId) {
		this.id = newId;
		return this;
	}

	public java.lang.Integer id() {
		return id;
	}

	public PlansPlan type(Type newType) {
		this.type = newType;
		return this;
	}

	public Type type() {
		return type;
	}

	public PlansPlan modifiedDate(java.lang.String newModifiedDate) {
		this.modifiedDate = newModifiedDate;
		return this;
	}

	public java.lang.String modifiedDate() {
		return modifiedDate;
	}

	public PlansPlan clientDisplayName(java.lang.String newClientDisplayName) {
		this.clientDisplayName = newClientDisplayName;
		return this;
	}

	public java.lang.String clientDisplayName() {
		return clientDisplayName;
	}

	public PlansPlan spouseDisplayName(@io.micronaut.core.annotation.Nullable java.lang.String newSpouseDisplayName) {
		this.spouseDisplayName = newSpouseDisplayName;
		return this;
	}

	public @io.micronaut.core.annotation.Nullable java.lang.String spouseDisplayName() {
		return spouseDisplayName;
	}

	public PlansPlan status(Status newStatus) {
		this.status = newStatus;
		return this;
	}

	public Status status() {
		return status;
	}

	public PlansPlan statusDate(@io.micronaut.core.annotation.Nullable java.lang.String newStatusDate) {
		this.statusDate = newStatusDate;
		return this;
	}

	public @io.micronaut.core.annotation.Nullable java.lang.String statusDate() {
		return statusDate;
	}

	public PlansPlan url(java.lang.String newUrl) {
		this.url = newUrl;
		return this;
	}

	public java.lang.String url() {
		return url;
	}


	// getter/setter
	public java.lang.Integer getId() {
		return id;
	}

	public PlansPlan setId(java.lang.Integer newId) {
		this.id = newId;
		return this;
	}


	public Type getType() {
		return type;
	}

	public PlansPlan setType(Type newType) {
		this.type = newType;
		return this;
	}


	public java.lang.String getModifiedDate() {
		return modifiedDate;
	}

	public PlansPlan setModifiedDate(java.lang.String newModifiedDate) {
		this.modifiedDate = newModifiedDate;
		return this;
	}


	public java.lang.String getClientDisplayName() {
		return clientDisplayName;
	}

	public PlansPlan setClientDisplayName(java.lang.String newClientDisplayName) {
		this.clientDisplayName = newClientDisplayName;
		return this;
	}


	public @io.micronaut.core.annotation.Nullable java.lang.String getSpouseDisplayName() {
		return spouseDisplayName;
	}

	public PlansPlan setSpouseDisplayName(@io.micronaut.core.annotation.Nullable java.lang.String newSpouseDisplayName) {
		this.spouseDisplayName = newSpouseDisplayName;
		return this;
	}


	public Status getStatus() {
		return status;
	}

	public PlansPlan setStatus(Status newStatus) {
		this.status = newStatus;
		return this;
	}


	public @io.micronaut.core.annotation.Nullable java.lang.String getStatusDate() {
		return statusDate;
	}

	public PlansPlan setStatusDate(@io.micronaut.core.annotation.Nullable java.lang.String newStatusDate) {
		this.statusDate = newStatusDate;
		return this;
	}


	public java.lang.String getUrl() {
		return url;
	}

	public PlansPlan setUrl(java.lang.String newUrl) {
		this.url = newUrl;
		return this;
	}




    

@io.micronaut.core.annotation.Introspected
public enum Type {

	INDIVIDUAL("INDIVIDUAL"),
	SPOUSAL("SPOUSAL");

	public static final java.lang.String INDIVIDUAL_VALUE = "INDIVIDUAL";
	public static final java.lang.String SPOUSAL_VALUE = "SPOUSAL";

	private final java.lang.String value;

	private Type(java.lang.String value) {
		this.value = value;
	}

	@com.fasterxml.jackson.annotation.JsonCreator
	public static Type toEnum(java.lang.String value) {
		return toOptional(value).orElseThrow(() -> new IllegalArgumentException("Unknown value '" + value + "'."));
	}

	public static java.util.Optional<Type> toOptional(java.lang.String value) {
		return java.util.Arrays
				.stream(values())
				.filter(e -> e.value.equals(value))
				.findAny();
	}

	@com.fasterxml.jackson.annotation.JsonValue
	public java.lang.String getValue() {
		return value;
	}
}

@io.micronaut.core.annotation.Introspected
public enum Status {

	PARTIAL("PARTIAL"),
	COMPLETED("COMPLETED"),
	EXPIRED("EXPIRED");

	public static final java.lang.String PARTIAL_VALUE = "PARTIAL";
	public static final java.lang.String COMPLETED_VALUE = "COMPLETED";
	public static final java.lang.String EXPIRED_VALUE = "EXPIRED";

	private final java.lang.String value;

	private Status(java.lang.String value) {
		this.value = value;
	}

	@com.fasterxml.jackson.annotation.JsonCreator
	public static Status toEnum(java.lang.String value) {
		return toOptional(value).orElseThrow(() -> new IllegalArgumentException("Unknown value '" + value + "'."));
	}

	public static java.util.Optional<Status> toOptional(java.lang.String value) {
		return java.util.Arrays
				.stream(values())
				.filter(e -> e.value.equals(value))
				.findAny();
	}

	@com.fasterxml.jackson.annotation.JsonValue
	public java.lang.String getValue() {
		return value;
	}
}
}

