package com.equisoft.plan.sdk;
import com.equisoft.plan.sdk.models.*;

/** Test client for {@link PlansV1Api}. **/
@javax.annotation.processing.Generated(value = "com.equisoft.openapi.generator.micronaut.MicronautClientGenerator", date = "2022-03-25T20:51:43.174045974Z[Etc/UTC]")

@io.micronaut.http.client.annotation.Client("${test.clientId:/}")
public interface PlansV1ApiTestClient { 

	@io.micronaut.http.annotation.Get("/fna/api/fna/{id:[0-9]+}")
	io.micronaut.http.HttpResponse<?> getPlan(
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.PathVariable(name = "id")
			java.lang.Integer id);

	@io.micronaut.http.annotation.Put("/fna/{fna-uuid}/client/{client-uuid}/external-id")
	@io.micronaut.http.annotation.Produces({ "text/plain" })
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	io.micronaut.http.HttpResponse<?> updatePlanExternalId(
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.PathVariable(name = "fna-uuid")
			java.lang.String fnaUuid,
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.PathVariable(name = "client-uuid")
			java.lang.String clientUuid,
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.Body
			java.lang.String body);
}
