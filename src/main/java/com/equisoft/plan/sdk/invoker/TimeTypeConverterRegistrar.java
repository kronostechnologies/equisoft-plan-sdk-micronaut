package com.equisoft.plan.sdk.invoker;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeParseException;
import java.util.Optional;

import javax.inject.Singleton;

import io.micronaut.context.annotation.BootstrapContextCompatible;
import io.micronaut.core.convert.ConversionService;
import io.micronaut.core.convert.TypeConverterRegistrar;

@javax.annotation.processing.Generated(value = "com.equisoft.openapi.generator.micronaut.MicronautClientGenerator", date = "2022-06-07T20:14:48.098386786Z[Etc/UTC]")

@Singleton
@BootstrapContextCompatible
public class TimeTypeConverterRegistrar implements TypeConverterRegistrar {

	@Override
	public void register(ConversionService<?> conversionService) {

		conversionService.addConverter(Instant.class, String.class, Instant::toString);
		conversionService.addConverter(String.class, Instant.class, (object, type, context) -> {
			try {
				return object == null ? Optional.empty() : Optional.of(ZonedDateTime.parse(object).toInstant());
			} catch (DateTimeParseException e) {
				try {
					return Optional.of(LocalDateTime.parse(object).toInstant(ZoneOffset.UTC));
				} catch (DateTimeParseException e1) {
					context.reject(object, e);
					return Optional.empty();
				}
			}
		});

		conversionService.addConverter(LocalDate.class, String.class, LocalDate::toString);
		conversionService.addConverter(String.class, LocalDate.class, (object, type, context) -> {
			try {
				return object == null ? Optional.empty() : Optional.of(LocalDate.parse(object));
			} catch (DateTimeParseException e) {
				context.reject(object, e);
				return Optional.empty();
			}
		});
	}
}
