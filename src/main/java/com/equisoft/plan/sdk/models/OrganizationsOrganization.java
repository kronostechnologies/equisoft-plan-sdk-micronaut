package com.equisoft.plan.sdk.models;

@javax.annotation.processing.Generated(value = "com.equisoft.openapi.generator.micronaut.MicronautClientGenerator", date = "2021-11-05T18:55:29.606575Z[Etc/UTC]")

@io.micronaut.core.annotation.Introspected
public class OrganizationsOrganization {

	public static final String JSON_PROPERTY_ID = "id";
	public static final String JSON_PROPERTY_ACCOUNT_TYPE = "accountType";
	public static final String JSON_PROPERTY_EXTERNAL_DATABASE = "externalDatabase";
	public static final String JSON_PROPERTY_ORGANIZATION_UUID = "organizationUuid";

	@javax.validation.constraints.NotNull
	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_ID)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS)
	private java.lang.Integer id;

	@javax.validation.constraints.NotNull
	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_ACCOUNT_TYPE)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS)
	private java.lang.String accountType;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_EXTERNAL_DATABASE)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_ABSENT)
	private @io.micronaut.core.annotation.Nullable java.lang.String externalDatabase;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_ORGANIZATION_UUID)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_ABSENT)
	private @io.micronaut.core.annotation.Nullable java.lang.String organizationUuid;


	// methods

	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (object == null || getClass() != object.getClass()) {
			return false;
		}
		OrganizationsOrganization other = (OrganizationsOrganization) object;
		return java.util.Objects.equals(id, other.id)
				&& java.util.Objects.equals(accountType, other.accountType)
				&& java.util.Objects.equals(externalDatabase, other.externalDatabase)
				&& java.util.Objects.equals(organizationUuid, other.organizationUuid);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(id, accountType, externalDatabase, organizationUuid);
	}

	@Override
	public String toString() {
		return new StringBuilder()
				.append("OrganizationsOrganization[")
				.append("id=").append(id).append(",")
				.append("accountType=").append(accountType).append(",")
				.append("externalDatabase=").append(externalDatabase).append(",")
				.append("organizationUuid=").append(organizationUuid)
				.append("]")
				.toString();
	}

	// fluent

	public OrganizationsOrganization id(java.lang.Integer newId) {
		this.id = newId;
		return this;
	}

	public java.lang.Integer id() {
		return id;
	}

	public OrganizationsOrganization accountType(java.lang.String newAccountType) {
		this.accountType = newAccountType;
		return this;
	}

	public java.lang.String accountType() {
		return accountType;
	}

	public OrganizationsOrganization externalDatabase(@io.micronaut.core.annotation.Nullable java.lang.String newExternalDatabase) {
		this.externalDatabase = newExternalDatabase;
		return this;
	}

	public @io.micronaut.core.annotation.Nullable java.lang.String externalDatabase() {
		return externalDatabase;
	}

	public OrganizationsOrganization organizationUuid(@io.micronaut.core.annotation.Nullable java.lang.String newOrganizationUuid) {
		this.organizationUuid = newOrganizationUuid;
		return this;
	}

	public @io.micronaut.core.annotation.Nullable java.lang.String organizationUuid() {
		return organizationUuid;
	}


	// getter/setter
	public java.lang.Integer getId() {
		return id;
	}

	public OrganizationsOrganization setId(java.lang.Integer newId) {
		this.id = newId;
		return this;
	}


	public java.lang.String getAccountType() {
		return accountType;
	}

	public OrganizationsOrganization setAccountType(java.lang.String newAccountType) {
		this.accountType = newAccountType;
		return this;
	}


	public @io.micronaut.core.annotation.Nullable java.lang.String getExternalDatabase() {
		return externalDatabase;
	}

	public OrganizationsOrganization setExternalDatabase(@io.micronaut.core.annotation.Nullable java.lang.String newExternalDatabase) {
		this.externalDatabase = newExternalDatabase;
		return this;
	}


	public @io.micronaut.core.annotation.Nullable java.lang.String getOrganizationUuid() {
		return organizationUuid;
	}

	public OrganizationsOrganization setOrganizationUuid(@io.micronaut.core.annotation.Nullable java.lang.String newOrganizationUuid) {
		this.organizationUuid = newOrganizationUuid;
		return this;
	}




    
}

