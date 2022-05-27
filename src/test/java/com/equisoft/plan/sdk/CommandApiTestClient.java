package com.equisoft.plan.sdk;
import com.equisoft.plan.sdk.models.*;

/** Test client for {@link CommandApi}. **/
@javax.annotation.processing.Generated(value = "com.equisoft.openapi.generator.micronaut.MicronautClientGenerator", date = "2022-05-27T18:14:02.567189188Z[Etc/UTC]")

@io.micronaut.http.client.annotation.Client("${test.clientId:/}")
public interface CommandApiTestClient { 

	@io.micronaut.http.annotation.Post("/fna/api/v2/cmd/copy/fna")
	@io.micronaut.http.annotation.Produces({ "application/json" })
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	io.micronaut.http.HttpResponse<CmdCopyFNAResponse> cmdCopyFNA(
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.Body
			CmdCopyFNA cmdCopyFNA);
}
