package org.cloudspace.billing.datadelivery.beans;

public class BE111HeaderSectionBean {
	private String csHeaderRecordType;
	private String csHdrCustId;
	private String csHdrTimeDate;
	private String csBusTransTypCD;
	private String csHdrDataTypeCD;
	public String getCsHeaderRecordType() {
		return csHeaderRecordType;
	}
	public void setCsHeaderRecordType(String csHeaderRecordType) {
		this.csHeaderRecordType = csHeaderRecordType;
	}
	public String getCsHdrCustId() {
		return csHdrCustId;
	}
	public void setCsHdrCustId(String csHdrCustId) {
		this.csHdrCustId = csHdrCustId;
	}
	public String getCsHdrTimeDate() {
		return csHdrTimeDate;
	}
	public void setCsHdrTimeDate(String csHdrTimeDate) {
		this.csHdrTimeDate = csHdrTimeDate;
	}
	public String getCsBusTransTypCD() {
		return csBusTransTypCD;
	}
	public void setCsBusTransTypCD(String csBusTransTypCD) {
		this.csBusTransTypCD = csBusTransTypCD;
	}
	public String getCsHdrDataTypeCD() {
		return csHdrDataTypeCD;
	}
	public void setCsHdrDataTypeCD(String csHdrDataTypeCD) {
		this.csHdrDataTypeCD = csHdrDataTypeCD;
	}
	@Override
	public String toString() {
		return "BE111HeaderSectionBean [csHeaderRecordType=" + csHeaderRecordType + ", csHdrCustId=" + csHdrCustId
				+ ", csHdrTimeDate=" + csHdrTimeDate + ", csBusTransTypCD=" + csBusTransTypCD + ", csHdrDataTypeCD="
				+ csHdrDataTypeCD + "]";
	}
	
}
