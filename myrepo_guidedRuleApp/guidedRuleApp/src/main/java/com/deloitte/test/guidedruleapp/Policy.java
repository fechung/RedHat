package com.deloitte.test.guidedruleapp;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Label("Policy")
public class Policy implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("Policy No")
	private java.lang.String policyNo;

	@org.kie.api.definition.type.Label(value = "Claim List")
	private java.util.List<com.deloitte.test.guidedruleapp.Claim> claimList;

	public Policy() {
	}

	public java.lang.String getPolicyNo() {
		return this.policyNo;
	}

	public void setPolicyNo(java.lang.String policyNo) {
		this.policyNo = policyNo;
	}

	public java.util.List<com.deloitte.test.guidedruleapp.Claim> getClaimList() {
		return this.claimList;
	}

	public void setClaimList(
			java.util.List<com.deloitte.test.guidedruleapp.Claim> claimList) {
		this.claimList = claimList;
	}

	public Policy(java.lang.String policyNo,
			java.util.List<com.deloitte.test.guidedruleapp.Claim> claimList) {
		this.policyNo = policyNo;
		this.claimList = claimList;
	}

}