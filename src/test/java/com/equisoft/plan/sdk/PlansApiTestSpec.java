package com.equisoft.plan.sdk;

/** Test for {@link PlansApi}. */
@javax.annotation.processing.Generated(value = "com.equisoft.openapi.generator.micronaut.MicronautClientGenerator", date = "2022-02-18T21:15:27.342970Z[Etc/UTC]")

public interface PlansApiTestSpec { 

	// listPlans

	/** Test for {@link PlansApi#listPlans} with repsonse code 200. */
	void listPlans200() throws Exception;

	/** Test for {@link PlansApi#listPlans} with repsonse code 401. */
	void listPlans401() throws Exception;

	/** Test for {@link PlansApi#listPlans} with repsonse code 500. */
	void listPlans500() throws Exception;
}
