package com.equisoft.plan.sdk;

/** Test for {@link PlansApi}. */
@javax.annotation.processing.Generated(value = "com.equisoft.openapi.generator.micronaut.MicronautClientGenerator", date = "2022-07-18T12:42:13.488647146Z[Etc/UTC]")

public interface PlansApiTestSpec { 

	// listPlans

	/** Test for {@link PlansApi#listPlans} with repsonse code 200. */
	void listPlans200() throws Exception;

	/** Test for {@link PlansApi#listPlans} with repsonse code 401. */
	void listPlans401() throws Exception;

	/** Test for {@link PlansApi#listPlans} with repsonse code 500. */
	void listPlans500() throws Exception;
}
