package com.test1;

public class RazorAcceptanceToWithdrawals {
	private Integer razorAcceptanceCode;
	private Integer dataCustodianId;
	private Integer withdrawalId;
	private String preTransactionApplicable;
	private Integer businessIndicator;
	private boolean userCode;
	private boolean countryCode;
	private String unitName;
	private String hpeRatesMappingId;
	private String creationCr;
	private String modifiedCr;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public RazorAcceptanceToWithdrawals() {

	}

	public RazorAcceptanceToWithdrawals(Integer razorAcceptanceCode, Integer dataCustodianId, Integer withdrawalId,
			String preTransactionApplicable, Integer businessIndicator, boolean userCode, boolean countryCode,
			String unitName, String hpeRatesMappingId, String creationCr, String modifiedCr, String creationDate,
			String modifiedDate, String entityState) {
		super();
		this.razorAcceptanceCode = razorAcceptanceCode;
		this.dataCustodianId = dataCustodianId;
		this.withdrawalId = withdrawalId;
		this.preTransactionApplicable = preTransactionApplicable;
		this.businessIndicator = businessIndicator;
		this.userCode = userCode;
		this.countryCode = countryCode;
		this.unitName = unitName;
		this.hpeRatesMappingId = hpeRatesMappingId;
		this.creationCr = creationCr;
		this.modifiedCr = modifiedCr;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getRazorAcceptanceCode() {
		return razorAcceptanceCode;
	}

	public void setRazorAcceptanceCode(Integer razorAcceptanceCode) {
		this.razorAcceptanceCode = razorAcceptanceCode;
	}

	public Integer getDataCustodianId() {
		return dataCustodianId;
	}

	public void setDataCustodianId(Integer dataCustodianId) {
		this.dataCustodianId = dataCustodianId;
	}

	public Integer getWithdrawalId() {
		return withdrawalId;
	}

	public void setWithdrawalId(Integer withdrawalId) {
		this.withdrawalId = withdrawalId;
	}

	public String getPreTransactionApplicable() {
		return preTransactionApplicable;
	}

	public void setPreTransactionApplicable(String preTransactionApplicable) {
		this.preTransactionApplicable = preTransactionApplicable;
	}

	public Integer getBusinessIndicator() {
		return businessIndicator;
	}

	public void setBusinessIndicator(Integer businessIndicator) {
		this.businessIndicator = businessIndicator;
	}

	public boolean isUserCode() {
		return userCode;
	}

	public void setUserCode(boolean userCode) {
		this.userCode = userCode;
	}

	public boolean isCountryCode() {
		return countryCode;
	}

	public void setCountryCode(boolean countryCode) {
		this.countryCode = countryCode;
	}

	public String getUnitName() {
		return unitName;
	}

	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}

	public String getHpeRatesMappingId() {
		return hpeRatesMappingId;
	}

	public void setHpeRatesMappingId(String hpeRatesMappingId) {
		this.hpeRatesMappingId = hpeRatesMappingId;
	}

	public String getCreationCr() {
		return creationCr;
	}

	public void setCreationCr(String creationCr) {
		this.creationCr = creationCr;
	}

	public String getModifiedCr() {
		return modifiedCr;
	}

	public void setModifiedCr(String modifiedCr) {
		this.modifiedCr = modifiedCr;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
