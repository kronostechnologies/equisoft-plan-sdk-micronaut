package com.equisoft.plan.sdk.models;

@javax.annotation.processing.Generated(value = "com.equisoft.openapi.generator.micronaut.MicronautClientGenerator", date = "2021-11-04T20:21:36.791874Z[Etc/UTC]")

@io.micronaut.core.annotation.Introspected
public class UsersUser {

	public static final String JSON_PROPERTY_ID = "id";
	public static final String JSON_PROPERTY_USER_TYPE = "userType";
	public static final String JSON_PROPERTY_NAME = "name";
	public static final String JSON_PROPERTY_EMAIL = "email";
	public static final String JSON_PROPERTY_IS_ADMIN = "isAdmin";
	public static final String JSON_PROPERTY_IS_ACTIVE = "isActive";

	@javax.validation.constraints.NotNull
	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_ID)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS)
	private java.lang.Integer id;

	@javax.validation.constraints.NotNull
	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_USER_TYPE)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS)
	private java.lang.String userType;

	@javax.validation.constraints.NotNull
	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_NAME)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS)
	private java.lang.String name;

	@javax.validation.constraints.NotNull
	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_EMAIL)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS)
	private java.lang.String email;

	@javax.validation.constraints.NotNull
	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_IS_ADMIN)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS)
	private java.lang.Boolean isAdmin;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_IS_ACTIVE)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private @io.micronaut.core.annotation.Nullable java.lang.Boolean isActive;


	// methods

	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (object == null || getClass() != object.getClass()) {
			return false;
		}
		UsersUser other = (UsersUser) object;
		return java.util.Objects.equals(id, other.id)
				&& java.util.Objects.equals(userType, other.userType)
				&& java.util.Objects.equals(name, other.name)
				&& java.util.Objects.equals(email, other.email)
				&& java.util.Objects.equals(isAdmin, other.isAdmin)
				&& java.util.Objects.equals(isActive, other.isActive);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(id, userType, name, email, isAdmin, isActive);
	}

	@Override
	public String toString() {
		return new StringBuilder()
				.append("UsersUser[")
				.append("id=").append(id).append(",")
				.append("userType=").append(userType).append(",")
				.append("name=").append(name).append(",")
				.append("email=").append(email).append(",")
				.append("isAdmin=").append(isAdmin).append(",")
				.append("isActive=").append(isActive)
				.append("]")
				.toString();
	}

	// fluent

	public UsersUser id(java.lang.Integer newId) {
		this.id = newId;
		return this;
	}

	public java.lang.Integer id() {
		return id;
	}

	public UsersUser userType(java.lang.String newUserType) {
		this.userType = newUserType;
		return this;
	}

	public java.lang.String userType() {
		return userType;
	}

	public UsersUser name(java.lang.String newName) {
		this.name = newName;
		return this;
	}

	public java.lang.String name() {
		return name;
	}

	public UsersUser email(java.lang.String newEmail) {
		this.email = newEmail;
		return this;
	}

	public java.lang.String email() {
		return email;
	}

	public UsersUser isAdmin(java.lang.Boolean newIsAdmin) {
		this.isAdmin = newIsAdmin;
		return this;
	}

	public java.lang.Boolean isAdmin() {
		return isAdmin;
	}

	public UsersUser isActive(@io.micronaut.core.annotation.Nullable java.lang.Boolean newIsActive) {
		this.isActive = newIsActive;
		return this;
	}

	public @io.micronaut.core.annotation.Nullable java.lang.Boolean isActive() {
		return isActive;
	}


	// getter/setter
	public java.lang.Integer getId() {
		return id;
	}

	public UsersUser setId(java.lang.Integer newId) {
		this.id = newId;
		return this;
	}


	public java.lang.String getUserType() {
		return userType;
	}

	public UsersUser setUserType(java.lang.String newUserType) {
		this.userType = newUserType;
		return this;
	}


	public java.lang.String getName() {
		return name;
	}

	public UsersUser setName(java.lang.String newName) {
		this.name = newName;
		return this;
	}


	public java.lang.String getEmail() {
		return email;
	}

	public UsersUser setEmail(java.lang.String newEmail) {
		this.email = newEmail;
		return this;
	}


	public java.lang.Boolean getIsAdmin() {
		return isAdmin;
	}

	public UsersUser setIsAdmin(java.lang.Boolean newIsAdmin) {
		this.isAdmin = newIsAdmin;
		return this;
	}


	public @io.micronaut.core.annotation.Nullable java.lang.Boolean getIsActive() {
		return isActive;
	}

	public UsersUser setIsActive(@io.micronaut.core.annotation.Nullable java.lang.Boolean newIsActive) {
		this.isActive = newIsActive;
		return this;
	}




    
}

