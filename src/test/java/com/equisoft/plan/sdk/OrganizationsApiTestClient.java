package com.equisoft.plan.sdk;
import com.equisoft.plan.sdk.models.*;

/** Test client for {@link OrganizationsApi}. **/
@javax.annotation.processing.Generated(value = "com.equisoft.openapi.generator.micronaut.MicronautClientGenerator", date = "2022-05-04T19:14:43.282306767Z[Etc/UTC]")

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
