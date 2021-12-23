package com.equisoft.plan.sdk;
import com.equisoft.plan.sdk.models.*;

@javax.annotation.processing.Generated(value = "com.equisoft.openapi.generator.micronaut.MicronautClientGenerator", date = "2021-12-23T18:43:32.824979Z[Etc/UTC]")

public interface OrganizationsApi {


	@io.micronaut.http.annotation.Get("/fna/api/v2/organizations/{id:[0-9]+}")
	@io.micronaut.http.annotation.Produces({ "application/json" })
	io.micronaut.http.HttpResponse<OrganizationsOrganization> getOrganization(
			@io.micronaut.http.annotation.PathVariable(name = "id")
			java.lang.Integer id);

	@io.micronaut.http.annotation.Get("/fna/api/v2/organizations/{id:[0-9]+}/users")
	@io.micronaut.http.annotation.Produces({ "application/json" })
	io.micronaut.http.HttpResponse<UsersListUsersResponse> listOrganizationUsers(
			@io.micronaut.http.annotation.PathVariable(name = "id")
			java.lang.Integer id);

	@io.micronaut.http.annotation.Get("/fna/api/v2/organizations")
	@io.micronaut.http.annotation.Produces({ "application/json" })
	io.micronaut.http.HttpResponse<OrganizationsListOrganizationsResponse> listOrganizations(
			@javax.validation.constraints.NotNull
			@io.micronaut.http.annotation.QueryValue(value = "organizationUuid")
			java.lang.String organizationUuid);
}
