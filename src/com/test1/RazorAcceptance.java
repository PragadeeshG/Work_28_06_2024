package com.test1;

public class RazorAcceptance {
	private Integer razorAcceptanceCode;
	private Integer hpeRatesEffective;
	private String hpeRatesEffectiveDate;
	private String hpeRatesRazorAcceptanceDesc;
	private String hpeRatesRazorAcceptanceShortDesc;
	private Integer hpeRatesDecimalPositions;
	private String hpeRatesRazorAcceptanceSymbol;
	private String hpeRatesRazorAcceptanceScale;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public RazorAcceptance() {

	}

	public RazorAcceptance(Integer razorAcceptanceCode, Integer hpeRatesEffective, String hpeRatesEffectiveDate,
			String hpeRatesRazorAcceptanceDesc, String hpeRatesRazorAcceptanceShortDesc,
			Integer hpeRatesDecimalPositions, String hpeRatesRazorAcceptanceSymbol, String hpeRatesRazorAcceptanceScale,
			String creationDate, String modifiedDate, String entityState) {
		super();
		this.razorAcceptanceCode = razorAcceptanceCode;
		this.hpeRatesEffective = hpeRatesEffective;
		this.hpeRatesEffectiveDate = hpeRatesEffectiveDate;
		this.hpeRatesRazorAcceptanceDesc = hpeRatesRazorAcceptanceDesc;
		this.hpeRatesRazorAcceptanceShortDesc = hpeRatesRazorAcceptanceShortDesc;
		this.hpeRatesDecimalPositions = hpeRatesDecimalPositions;
		this.hpeRatesRazorAcceptanceSymbol = hpeRatesRazorAcceptanceSymbol;
		this.hpeRatesRazorAcceptanceScale = hpeRatesRazorAcceptanceScale;
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

	public Integer getHpeRatesEffective() {
		return hpeRatesEffective;
	}

	public void setHpeRatesEffective(Integer hpeRatesEffective) {
		this.hpeRatesEffective = hpeRatesEffective;
	}

	public String getHpeRatesEffectiveDate() {
		return hpeRatesEffectiveDate;
	}

	public void setHpeRatesEffectiveDate(String hpeRatesEffectiveDate) {
		this.hpeRatesEffectiveDate = hpeRatesEffectiveDate;
	}

	public String getHpeRatesRazorAcceptanceDesc() {
		return hpeRatesRazorAcceptanceDesc;
	}

	public void setHpeRatesRazorAcceptanceDesc(String hpeRatesRazorAcceptanceDesc) {
		this.hpeRatesRazorAcceptanceDesc = hpeRatesRazorAcceptanceDesc;
	}

	public String getHpeRatesRazorAcceptanceShortDesc() {
		return hpeRatesRazorAcceptanceShortDesc;
	}

	public void setHpeRatesRazorAcceptanceShortDesc(String hpeRatesRazorAcceptanceShortDesc) {
		this.hpeRatesRazorAcceptanceShortDesc = hpeRatesRazorAcceptanceShortDesc;
	}

	public Integer getHpeRatesDecimalPositions() {
		return hpeRatesDecimalPositions;
	}

	public void setHpeRatesDecimalPositions(Integer hpeRatesDecimalPositions) {
		this.hpeRatesDecimalPositions = hpeRatesDecimalPositions;
	}

	public String getHpeRatesRazorAcceptanceSymbol() {
		return hpeRatesRazorAcceptanceSymbol;
	}

	public void setHpeRatesRazorAcceptanceSymbol(String hpeRatesRazorAcceptanceSymbol) {
		this.hpeRatesRazorAcceptanceSymbol = hpeRatesRazorAcceptanceSymbol;
	}

	public String getHpeRatesRazorAcceptanceScale() {
		return hpeRatesRazorAcceptanceScale;
	}

	public void setHpeRatesRazorAcceptanceScale(String hpeRatesRazorAcceptanceScale) {
		this.hpeRatesRazorAcceptanceScale = hpeRatesRazorAcceptanceScale;
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
