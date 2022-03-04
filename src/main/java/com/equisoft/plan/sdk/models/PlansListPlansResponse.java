package com.equisoft.plan.sdk.models;

@javax.annotation.processing.Generated(value = "com.equisoft.openapi.generator.micronaut.MicronautClientGenerator", date = "2022-03-04T21:03:24.303091Z[Etc/UTC]")

@io.micronaut.core.annotation.Introspected
public class PlansListPlansResponse {

	public static final String JSON_PROPERTY_PLANS = "plans";
	public static final String JSON_PROPERTY_CREATE_PLAN_URL = "createPlanUrl";

	@javax.validation.Valid
	@javax.validation.constraints.NotNull
	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_PLANS)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS)
	private java.util.List<PlansPlan> plans = new java.util.ArrayList<PlansPlan>();

	@javax.validation.constraints.NotNull
	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_CREATE_PLAN_URL)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS)
	private java.lang.String createPlanUrl;


	// methods

	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (object == null || getClass() != object.getClass()) {
			return false;
		}
		PlansListPlansResponse other = (PlansListPlansResponse) object;
		return java.util.Objects.equals(plans, other.plans)
				&& java.util.Objects.equals(createPlanUrl, other.createPlanUrl);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(plans, createPlanUrl);
	}

	@Override
	public String toString() {
		return new StringBuilder()
				.append("PlansListPlansResponse[")
				.append("plans=").append(plans).append(",")
				.append("createPlanUrl=").append(createPlanUrl)
				.append("]")
				.toString();
	}

	// fluent

	public PlansListPlansResponse plans(java.util.List<PlansPlan> newPlans) {
		this.plans = newPlans;
		return this;
	}

	public java.util.List<PlansPlan> plans() {
		return plans;
	}

	public PlansListPlansResponse createPlanUrl(java.lang.String newCreatePlanUrl) {
		this.createPlanUrl = newCreatePlanUrl;
		return this;
	}

	public java.lang.String createPlanUrl() {
		return createPlanUrl;
	}


	// getter/setter
	public java.util.List<PlansPlan> getPlans() {
		return plans;
	}

	public PlansListPlansResponse setPlans(java.util.List<PlansPlan> newPlans) {
		this.plans = newPlans;
		return this;
	}

	public PlansListPlansResponse addPlansItem(PlansPlan plansItem) {
		if (this.plans == null) {
			this.plans = new java.util.ArrayList<PlansPlan>();
		}
		this.plans.add(plansItem);
		return this;
	}

	public java.lang.String getCreatePlanUrl() {
		return createPlanUrl;
	}

	public PlansListPlansResponse setCreatePlanUrl(java.lang.String newCreatePlanUrl) {
		this.createPlanUrl = newCreatePlanUrl;
		return this;
	}




    
}

