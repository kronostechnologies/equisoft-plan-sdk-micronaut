package com.equisoft.plan.sdk;

/** Test for {@link PlansV1Api}. */
@javax.annotation.processing.Generated(value = "com.equisoft.openapi.generator.micronaut.MicronautClientGenerator", date = "2021-09-17T13:05:15.700598Z[Etc/UTC]")

public interface PlansV1ApiTestSpec { 

	// getPlan

	/** Test for {@link PlansV1Api#getPlan} with repsonse code 200. */
	void getPlan200() throws Exception;

	/** Test for {@link PlansV1Api#getPlan} with repsonse code 404. */
	void getPlan404() throws Exception;

	// updatePlanExternalId

	/** Test for {@link PlansV1Api#updatePlanExternalId} with repsonse code 200. */
	void updatePlanExternalId200() throws Exception;

	/** Test for {@link PlansV1Api#updatePlanExternalId} with repsonse code 400. */
	void updatePlanExternalId400() throws Exception;

	/** Test for {@link PlansV1Api#updatePlanExternalId} with repsonse code 500. */
	void updatePlanExternalId500() throws Exception;
}
