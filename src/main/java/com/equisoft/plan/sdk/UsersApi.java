package com.equisoft.plan.sdk;
import com.equisoft.plan.sdk.models.*;

@javax.annotation.processing.Generated(value = "com.equisoft.openapi.generator.micronaut.MicronautClientGenerator", date = "2022-08-01T18:12:53.452448853Z[Etc/UTC]")

public interface UsersApi {


	@io.micronaut.http.annotation.Get("/fna/api/v2/users/{id:[0-9]+}")
	@io.micronaut.http.annotation.Produces({ "application/json" })
	io.micronaut.http.HttpResponse<UsersUser> getUser(
			@io.micronaut.http.annotation.PathVariable(name = "id")
			java.lang.Integer id);

	@io.micronaut.http.annotation.Get("/fna/api/v2/userContext")
	@io.micronaut.http.annotation.Produces({ "application/json" })
	io.micronaut.http.HttpResponse<UsersUserContext> getUserContext();
}
