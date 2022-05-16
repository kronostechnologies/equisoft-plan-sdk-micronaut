package com.equisoft.plan.sdk;

/** Test for {@link PlansApi}. */
@javax.annotation.processing.Generated(value = "com.equisoft.openapi.generator.micronaut.MicronautClientGenerator", date = "2022-05-16T12:06:41.930221845Z[Etc/UTC]")

public interface PlansApiTestSpec { 

	// listPlans

	/** Test for {@link PlansApi#listPlans} with repsonse code 200. */
	void listPlans200() throws Exception;

	/** Test for {@link PlansApi#listPlans} with repsonse code 401. */
	void listPlans401() throws Exception;

	/** Test for {@link PlansApi#listPlans} with repsonse code 500. */
	void listPlans500() throws Exception;
}
