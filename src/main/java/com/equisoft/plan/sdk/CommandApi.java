package com.equisoft.plan.sdk;
import com.equisoft.plan.sdk.models.*;

@javax.annotation.processing.Generated(value = "com.equisoft.openapi.generator.micronaut.MicronautClientGenerator", date = "2022-04-01T13:10:10.837630774Z[Etc/UTC]")

public interface CommandApi {


	@io.micronaut.http.annotation.Post("/fna/api/v2/cmd/copy/fna")
	@io.micronaut.http.annotation.Consumes("application/json")
	@io.micronaut.http.annotation.Produces({ "application/json" })
	io.micronaut.http.HttpResponse<CmdCopyFNAResponse> cmdCopyFNA(
			@javax.validation.Valid
			@javax.validation.constraints.NotNull
			@io.micronaut.http.annotation.Body
			CmdCopyFNA cmdCopyFNA);
}
