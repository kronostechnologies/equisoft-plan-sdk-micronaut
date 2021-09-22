package com.equisoft.plan.sdk;
import com.equisoft.plan.sdk.models.*;

/** Test client for {@link OrganizationsApi}. **/
@javax.annotation.processing.Generated(value = "com.equisoft.openapi.generator.micronaut.MicronautClientGenerator", date = "2021-09-22T17:46:05.058702Z[Etc/UTC]")

@io.micronaut.http.client.annotation.Client("${test.clientId:/}")
public interface OrganizationsApiTestClient { 

	@io.micronaut.http.annotation.Get("/fna/api/v2/organizations/{id:[0-9]+}")
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	io.micronaut.http.HttpResponse<OrganizationsOrganization> getOrganization(
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.PathVariable(name = "id")
			java.lang.Integer id);

	@io.micronaut.http.annotation.Get("/fna/api/v2/organizations/{id:[0-9]+}/users")
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	io.micronaut.http.HttpResponse<UsersListUsersResponse> listOrganizationUsers(
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.PathVariable(name = "id")
			java.lang.Integer id);

	@io.micronaut.http.annotation.Get("/fna/api/v2/organizations")
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	io.micronaut.http.HttpResponse<OrganizationsListOrganizationsResponse> listOrganizations(
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "organizationUuid")
			java.lang.String organizationUuid);
}
