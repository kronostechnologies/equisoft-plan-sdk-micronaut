package com.equisoft.plan.sdk.invoker;

import javax.inject.Singleton;

import io.micronaut.context.annotation.Requires;
import io.micronaut.security.token.jwt.signature.SignatureGeneratorConfiguration;

@javax.annotation.processing.Generated(value = "com.equisoft.openapi.generator.micronaut.MicronautClientGenerator", date = "2021-11-19T16:10:19.761269Z[Etc/UTC]")

@Requires(beans = SignatureGeneratorConfiguration.class)
@Singleton
public class JwtProvider {

	private final SignatureGeneratorConfiguration signature;

	public JwtProvider(SignatureGeneratorConfiguration signature) {
		this.signature = signature;
	}

	public JwtBuilder builder() {
		return new JwtBuilder(signature);
	}

	public String bearer(String subject, String... roles) {
		return new JwtBuilder(signature).subject(subject).roles(roles).toBearer();
	}
}
