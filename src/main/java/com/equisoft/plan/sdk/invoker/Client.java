package com.equisoft.plan.sdk.invoker;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target({ElementType.ANNOTATION_TYPE, ElementType.PARAMETER, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@io.micronaut.http.client.annotation.Client(id = "equisoft-plan")
@io.micronaut.http.annotation.FilterMatcher
public @interface Client {
}
