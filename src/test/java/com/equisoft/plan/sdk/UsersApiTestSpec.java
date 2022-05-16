package com.equisoft.plan.sdk;

/** Test for {@link UsersApi}. */
@javax.annotation.processing.Generated(value = "com.equisoft.openapi.generator.micronaut.MicronautClientGenerator", date = "2022-05-16T12:06:41.930221845Z[Etc/UTC]")

public interface UsersApiTestSpec { 

	// getUser

	/** Test for {@link UsersApi#getUser} with repsonse code 200. */
	void getUser200() throws Exception;

	/** Test for {@link UsersApi#getUser} with repsonse code 401. */
	void getUser401() throws Exception;

	/** Test for {@link UsersApi#getUser} with repsonse code 404. */
	void getUser404() throws Exception;

	/** Test for {@link UsersApi#getUser} with repsonse code 500. */
	void getUser500() throws Exception;
}
