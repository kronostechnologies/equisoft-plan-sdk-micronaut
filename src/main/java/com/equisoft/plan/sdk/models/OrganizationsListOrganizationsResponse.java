package com.equisoft.plan.sdk.models;

@javax.annotation.processing.Generated(value = "com.equisoft.openapi.generator.micronaut.MicronautClientGenerator", date = "2021-09-22T15:22:21.448345Z[Etc/UTC]")

@io.micronaut.core.annotation.Introspected
public class OrganizationsListOrganizationsResponse {

	public static final String JSON_PROPERTY_RESULTS = "results";

	@javax.validation.Valid
	@javax.validation.constraints.NotNull
	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_RESULTS)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS)
	private java.util.List<OrganizationsOrganization> results = new java.util.ArrayList<OrganizationsOrganization>();


	// methods

	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (object == null || getClass() != object.getClass()) {
			return false;
		}
		OrganizationsListOrganizationsResponse other = (OrganizationsListOrganizationsResponse) object;
		return java.util.Objects.equals(results, other.results);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(results);
	}

	@Override
	public String toString() {
		return new StringBuilder()
				.append("OrganizationsListOrganizationsResponse[")
				.append("results=").append(results)
				.append("]")
				.toString();
	}

	// fluent

	public OrganizationsListOrganizationsResponse results(java.util.List<OrganizationsOrganization> newResults) {
		this.results = newResults;
		return this;
	}

	public java.util.List<OrganizationsOrganization> results() {
		return results;
	}


	// getter/setter
	public java.util.List<OrganizationsOrganization> getResults() {
		return results;
	}

	public OrganizationsListOrganizationsResponse setResults(java.util.List<OrganizationsOrganization> newResults) {
		this.results = newResults;
		return this;
	}

	public OrganizationsListOrganizationsResponse addResultsItem(OrganizationsOrganization resultsItem) {
		if (this.results == null) {
			this.results = new java.util.ArrayList<OrganizationsOrganization>();
		}
		this.results.add(resultsItem);
		return this;
	}



    
}

