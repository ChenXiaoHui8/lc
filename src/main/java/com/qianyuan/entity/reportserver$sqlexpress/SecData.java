package com.qianyuan.entity.reportserver$sqlexpress;


public class SecData {

  private String secDataId;
  private String policyId;
  private long authType;
  private String xmlDescription;
  private String ntSecDescPrimary;
  private String ntSecDescSecondary;


  public String getSecDataId() {
    return secDataId;
  }

  public void setSecDataId(String secDataId) {
    this.secDataId = secDataId;
  }


  public String getPolicyId() {
    return policyId;
  }

  public void setPolicyId(String policyId) {
    this.policyId = policyId;
  }


  public long getAuthType() {
    return authType;
  }

  public void setAuthType(long authType) {
    this.authType = authType;
  }


  public String getXmlDescription() {
    return xmlDescription;
  }

  public void setXmlDescription(String xmlDescription) {
    this.xmlDescription = xmlDescription;
  }


  public String getNtSecDescPrimary() {
    return ntSecDescPrimary;
  }

  public void setNtSecDescPrimary(String ntSecDescPrimary) {
    this.ntSecDescPrimary = ntSecDescPrimary;
  }


  public String getNtSecDescSecondary() {
    return ntSecDescSecondary;
  }

  public void setNtSecDescSecondary(String ntSecDescSecondary) {
    this.ntSecDescSecondary = ntSecDescSecondary;
  }

}
