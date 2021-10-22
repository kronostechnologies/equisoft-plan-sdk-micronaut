package com.equisoft.plan.sdk;
import com.equisoft.plan.sdk.models.*;

/** Test client for {@link UsersApi}. **/
@javax.annotation.processing.Generated(value = "com.equisoft.openapi.generator.micronaut.MicronautClientGenerator", date = "2021-10-22T18:21:09.123736Z[Etc/UTC]")

@io.micronaut.http.client.annotation.Client("${test.clientId:/}")
public interface UsersApiTestClient { 

	@io.micronaut.http.annotation.Get("/fna/api/v2/users/{id:[0-9]+}")
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	io.micronaut.http.HttpResponse<UsersUser> getUser(
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.PathVariable(name = "id")
			java.lang.Integer id);
}
