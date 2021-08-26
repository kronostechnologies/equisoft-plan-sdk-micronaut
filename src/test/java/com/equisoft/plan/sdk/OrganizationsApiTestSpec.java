package com.equisoft.plan.sdk;

/** Test for {@link OrganizationsApi}. */
@javax.annotation.processing.Generated(value = "com.equisoft.openapi.generator.micronaut.MicronautClientGenerator", date = "2021-08-26T14:44:43.637536-04:00[America/Toronto]")

public interface OrganizationsApiTestSpec { 

	// getOrganization

	/** Test for {@link OrganizationsApi#getOrganization} with repsonse code 200. */
	void getOrganization200() throws Exception;

	/** Test for {@link OrganizationsApi#getOrganization} with repsonse code 401. */
	void getOrganization401() throws Exception;

	/** Test for {@link OrganizationsApi#getOrganization} with repsonse code 404. */
	void getOrganization404() throws Exception;

	/** Test for {@link OrganizationsApi#getOrganization} with repsonse code 500. */
	void getOrganization500() throws Exception;

	// listOrganizationUsers

	/** Test for {@link OrganizationsApi#listOrganizationUsers} with repsonse code 200. */
	void listOrganizationUsers200() throws Exception;

	/** Test for {@link OrganizationsApi#listOrganizationUsers} with repsonse code 401. */
	void listOrganizationUsers401() throws Exception;

	/** Test for {@link OrganizationsApi#listOrganizationUsers} with repsonse code 500. */
	void listOrganizationUsers500() throws Exception;

	// listOrganizations

	/** Test for {@link OrganizationsApi#listOrganizations} with repsonse code 200. */
	void listOrganizations200() throws Exception;

	/** Test for {@link OrganizationsApi#listOrganizations} with repsonse code 401. */
	void listOrganizations401() throws Exception;

	/** Test for {@link OrganizationsApi#listOrganizations} with repsonse code 500. */
	void listOrganizations500() throws Exception;
}
