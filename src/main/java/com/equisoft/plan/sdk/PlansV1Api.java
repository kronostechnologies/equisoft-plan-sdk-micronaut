package com.equisoft.plan.sdk;
import com.equisoft.plan.sdk.models.*;

@javax.annotation.processing.Generated(value = "com.equisoft.openapi.generator.micronaut.MicronautClientGenerator", date = "2021-12-23T19:01:21.895295Z[Etc/UTC]")

public interface PlansV1Api {


	/** Returns the plan */
	@io.micronaut.http.annotation.Get("/fna/api/fna/{id:[0-9]+}")
	io.micronaut.http.HttpResponse<Void> getPlan(
			@io.micronaut.http.annotation.PathVariable(name = "id")
			java.lang.Integer id);

	/** Update client UUID id of an FNA */
	@io.micronaut.http.annotation.Put("/fna/{fna-uuid}/client/{client-uuid}/external-id")
	@io.micronaut.http.annotation.Consumes("text/plain")
	@io.micronaut.http.annotation.Produces({ "application/json" })
	io.micronaut.http.HttpResponse<Void> updatePlanExternalId(
			@io.micronaut.http.annotation.PathVariable(name = "fna-uuid")
			java.lang.String fnaUuid,
			@io.micronaut.http.annotation.PathVariable(name = "client-uuid")
			java.lang.String clientUuid,
			@javax.validation.constraints.NotNull
			@io.micronaut.http.annotation.Body
			java.lang.String body);
}
