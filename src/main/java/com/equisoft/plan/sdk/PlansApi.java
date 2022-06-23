package com.equisoft.plan.sdk;
import com.equisoft.plan.sdk.models.*;

@javax.annotation.processing.Generated(value = "com.equisoft.openapi.generator.micronaut.MicronautClientGenerator", date = "2022-06-23T04:49:56.186774943Z[Etc/UTC]")

public interface PlansApi {


	@io.micronaut.http.annotation.Get("/fna/api/v2/plans")
	@io.micronaut.http.annotation.Produces({ "application/json" })
	io.micronaut.http.HttpResponse<PlansListPlansResponse> listPlans(
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "clientExternalUuid")
			java.lang.String clientExternalUuid);
}
