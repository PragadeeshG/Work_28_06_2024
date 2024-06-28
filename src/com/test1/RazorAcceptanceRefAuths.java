package com.test1;

public class RazorAcceptanceRefAuths {
	private Integer razorAcceptanceCode;
	private Integer groupCode;
	private Integer sequenceId;
	private String roleID;
	private String groupName;
	private Integer refAuthTypeCode;
	private String refAuthType;
	private String refAuthTypeDesc;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public RazorAcceptanceRefAuths() {

	}

	public RazorAcceptanceRefAuths(Integer razorAcceptanceCode, Integer groupCode, Integer sequenceId, String roleID,
			String groupName, Integer refAuthTypeCode, String refAuthType, String refAuthTypeDesc, String creationDate,
			String modifiedDate, String entityState) {
		super();
		this.razorAcceptanceCode = razorAcceptanceCode;
		this.groupCode = groupCode;
		this.sequenceId = sequenceId;
		this.roleID = roleID;
		this.groupName = groupName;
		this.refAuthTypeCode = refAuthTypeCode;
		this.refAuthType = refAuthType;
		this.refAuthTypeDesc = refAuthTypeDesc;
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

	public Integer getGroupCode() {
		return groupCode;
	}

	public void setGroupCode(Integer groupCode) {
		this.groupCode = groupCode;
	}

	public Integer getSequenceId() {
		return sequenceId;
	}

	public void setSequenceId(Integer sequenceId) {
		this.sequenceId = sequenceId;
	}

	public String getRoleID() {
		return roleID;
	}

	public void setRoleID(String roleID) {
		this.roleID = roleID;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public Integer getRefAuthTypeCode() {
		return refAuthTypeCode;
	}

	public void setRefAuthTypeCode(Integer refAuthTypeCode) {
		this.refAuthTypeCode = refAuthTypeCode;
	}

	public String getRefAuthType() {
		return refAuthType;
	}

	public void setRefAuthType(String refAuthType) {
		this.refAuthType = refAuthType;
	}

	public String getRefAuthTypeDesc() {
		return refAuthTypeDesc;
	}

	public void setRefAuthTypeDesc(String refAuthTypeDesc) {
		this.refAuthTypeDesc = refAuthTypeDesc;
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
