package com.equisoft.plan.sdk;
import com.equisoft.plan.sdk.models.*;

/** Test client for {@link PlansApi}. **/
@javax.annotation.processing.Generated(value = "com.equisoft.openapi.generator.micronaut.MicronautClientGenerator", date = "2022-02-21T14:10:38.172346Z[Etc/UTC]")

@io.micronaut.http.client.annotation.Client("${test.clientId:/}")
public interface PlansApiTestClient { 

	@io.micronaut.http.annotation.Get("/fna/api/v2/plans")
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	io.micronaut.http.HttpResponse<PlansListPlansResponse> listPlans(
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "clientExternalUuid")
			java.lang.String clientExternalUuid);
}
