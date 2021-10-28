# equisoft-plan-sdk-micronaut

Equisoft /plan API

- API version: latest

- Build date: 2021-10-28T19:43:57.467762Z[Etc/UTC]

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*

## Requirements

Building the API client library requires:

1. Java 13+

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
./gradlew build
```

### Gradle users

Add this dependency to your project's build file:

```kotlin
implementation("com.equisoft.plan.sdk:equisoft-plan-sdk-micronaut:6.52.0")
```

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.equisoft.plan.sdk</groupId>
  <artifactId>equisoft-plan-sdk-micronaut</artifactId>
  <version>6.52.0</version>
  <scope>compile</scope>
</dependency>
```

## Usage

This library must be used in conjunction with [Micronaut](https://docs.micronaut.io/latest/guide/).


The generated clients take advantage of [Micronaut's service discovery](https://docs.micronaut.io/latest/guide/#serviceDiscovery). To use manual discovery, configure the service URL in your **application.yml**:

```
micronaut:
  http:
    services:
      equisoft-plan:
        urls:
          - "https://my-service"
```

Finally, inject any `MyServiceApiClient` class and use the provided methods! They should reflect your API spec.

Everything that applies to [HTTP clients](https://docs.micronaut.io/latest/guide/#httpClient) in Micronaut's documentation can be leveraged here.

## Publication

To publish, configure your target repositories and simply run.

```shell
./gradlew build publish
```

It is possible to create a `local.build.gradle.kts` and `local.settings.gradle.kts` files that will not be overridden by the generator. You can add your publication configs in those files.

> **WARNING**
> Only the main project build scripts and precompiled project script plugins have type-safe model accessors. As a result, the `local.*.gradle.kts` files are affected by this limitation.
> Initialization scripts, settings scripts, script plugins do not.
> These limitations will be removed in a future Gradle release.
> See https://docs.gradle.org/7.1.1/userguide/kotlin_dsl.html#type-safe-accessors for more details.

## Documentation for API Endpoints

All URIs are relative to *http://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*CommandApi* | [**cmdCopyFNA**](docs/CommandApi.md#cmdCopyFNA) | **POST** /fna/api/v2/cmd/copy/fna | 
*OrganizationsApi* | [**getOrganization**](docs/OrganizationsApi.md#getOrganization) | **GET** /fna/api/v2/organizations/{id:[0-9]+} | 
*OrganizationsApi* | [**listOrganizationUsers**](docs/OrganizationsApi.md#listOrganizationUsers) | **GET** /fna/api/v2/organizations/{id:[0-9]+}/users | 
*OrganizationsApi* | [**listOrganizations**](docs/OrganizationsApi.md#listOrganizations) | **GET** /fna/api/v2/organizations | 
*PlansV1Api* | [**getPlan**](docs/PlansV1Api.md#getPlan) | **GET** /fna/api/fna/{id:[0-9]+} | Returns the plan
*PlansV1Api* | [**updatePlanExternalId**](docs/PlansV1Api.md#updatePlanExternalId) | **PUT** /fna/{fna-uuid}/client/{client-uuid}/external-id | Update client UUID id of an FNA
*UsersApi* | [**getUser**](docs/UsersApi.md#getUser) | **GET** /fna/api/v2/users/{id:[0-9]+} | 


## Documentation for Models

 - [CmdCopyFNA](docs/CmdCopyFNA.md)
 - [CmdCopyFNAResponse](docs/CmdCopyFNAResponse.md)
 - [ErrorResponse](docs/ErrorResponse.md)
 - [OrganizationsListOrganizationsResponse](docs/OrganizationsListOrganizationsResponse.md)
 - [OrganizationsOrganization](docs/OrganizationsOrganization.md)
 - [UsersListUsersResponse](docs/UsersListUsersResponse.md)
 - [UsersUser](docs/UsersUser.md)
 - [V1ErrorResponse](docs/V1ErrorResponse.md)
 - [V1ErrorResponseData](docs/V1ErrorResponseData.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### OAuth2


- **Type**: OAuth
- **Flow**: implicit
- **Authorization URL**: https://secure.kronos-web.com/oauth/authorize
- **Scopes**: 
  - fna:fna: Grants all access to plan/fna (deprecated)
  - plan:plan: Grants all access to plan/fna
  - plan:plan:create: Creation access on plan
  - plan:organization: Grants all access to plan/organizations
  - plan:user: Grants all access to plan/users


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



