package com.equisoft.plan.sdk.models;

@javax.annotation.processing.Generated(value = "com.equisoft.openapi.generator.micronaut.MicronautClientGenerator", date = "2022-07-06T18:45:53.097894837Z[Etc/UTC]")

@io.micronaut.core.annotation.Introspected
public class UsersListUsersResponse {

	public static final String JSON_PROPERTY_RESULTS = "results";

	@javax.validation.Valid
	@javax.validation.constraints.NotNull
	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_RESULTS)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS)
	private java.util.List<UsersUser> results = new java.util.ArrayList<UsersUser>();


	// methods

	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (object == null || getClass() != object.getClass()) {
			return false;
		}
		UsersListUsersResponse other = (UsersListUsersResponse) object;
		return java.util.Objects.equals(results, other.results);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(results);
	}

	@Override
	public String toString() {
		return new StringBuilder()
				.append("UsersListUsersResponse[")
				.append("results=").append(results)
				.append("]")
				.toString();
	}

	// fluent

	public UsersListUsersResponse results(java.util.List<UsersUser> newResults) {
		this.results = newResults;
		return this;
	}

	public java.util.List<UsersUser> results() {
		return results;
	}


	// getter/setter
	public java.util.List<UsersUser> getResults() {
		return results;
	}

	public UsersListUsersResponse setResults(java.util.List<UsersUser> newResults) {
		this.results = newResults;
		return this;
	}

	public UsersListUsersResponse addResultsItem(UsersUser resultsItem) {
		if (this.results == null) {
			this.results = new java.util.ArrayList<UsersUser>();
		}
		this.results.add(resultsItem);
		return this;
	}



    
}

