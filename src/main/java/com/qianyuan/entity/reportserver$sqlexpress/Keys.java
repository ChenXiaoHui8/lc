package com.qianyuan.entity.reportserver$sqlexpress;


public class Keys {

  private String machineName;
  private String installationId;
  private String instanceName;
  private long client;
  private String publicKey;
  private String symmetricKey;


  public String getMachineName() {
    return machineName;
  }

  public void setMachineName(String machineName) {
    this.machineName = machineName;
  }


  public String getInstallationId() {
    return installationId;
  }

  public void setInstallationId(String installationId) {
    this.installationId = installationId;
  }


  public String getInstanceName() {
    return instanceName;
  }

  public void setInstanceName(String instanceName) {
    this.instanceName = instanceName;
  }


  public long getClient() {
    return client;
  }

  public void setClient(long client) {
    this.client = client;
  }


  public String getPublicKey() {
    return publicKey;
  }

  public void setPublicKey(String publicKey) {
    this.publicKey = publicKey;
  }


  public String getSymmetricKey() {
    return symmetricKey;
  }

  public void setSymmetricKey(String symmetricKey) {
    this.symmetricKey = symmetricKey;
  }

}
