package com.equisoft.plan.sdk;

/** Test for {@link UsersApi}. */
@javax.annotation.processing.Generated(value = "com.equisoft.openapi.generator.micronaut.MicronautClientGenerator", date = "2022-06-28T19:41:51.151513625Z[Etc/UTC]")

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

	// getUserContext

	/** Test for {@link UsersApi#getUserContext} with repsonse code 200. */
	void getUserContext200() throws Exception;

	/** Test for {@link UsersApi#getUserContext} with repsonse code 401. */
	void getUserContext401() throws Exception;

	/** Test for {@link UsersApi#getUserContext} with repsonse code 404. */
	void getUserContext404() throws Exception;

	/** Test for {@link UsersApi#getUserContext} with repsonse code 500. */
	void getUserContext500() throws Exception;
}
