package com.deloitte.test.guidedruleapp;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Label("Claim")
public class Claim implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "Claim No")
	private java.lang.String claimNo;
	@org.kie.api.definition.type.Label(value = "Amount")
	private double amount;
	@org.kie.api.definition.type.Label(value = "Rejected")
	private boolean rejected;

	public Claim() {
	}

	public java.lang.String getClaimNo() {
		return this.claimNo;
	}

	public void setClaimNo(java.lang.String claimNo) {
		this.claimNo = claimNo;
	}

	public double getAmount() {
		return this.amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public boolean isRejected() {
		return this.rejected;
	}

	public void setRejected(boolean rejected) {
		this.rejected = rejected;
	}

	public Claim(java.lang.String claimNo, double amount, boolean rejected) {
		this.claimNo = claimNo;
		this.amount = amount;
		this.rejected = rejected;
	}

}