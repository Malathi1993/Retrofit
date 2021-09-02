package com.example.retrofit;

public class device_model {

    private Integer deviceId;

    public Integer getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public Integer getDeviceVersion() {
        return deviceVersion;
    }

    public void setDeviceVersion(Integer deviceVersion) {
        this.deviceVersion = deviceVersion;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getiPAddress() {
        return iPAddress;
    }

    public void setiPAddress(Integer iPAddress) {
        this.iPAddress = iPAddress;
    }

    public Integer getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(Integer appVersion) {
        this.appVersion = appVersion;
    }

    public String getDeviceMac() {
        return deviceMac;
    }

    public void setDeviceMac(String deviceMac) {
        this.deviceMac = deviceMac;
    }

    public String getDeviceModel() {
        return deviceModel;
    }

    public void setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getPushNotificationToken() {
        return pushNotificationToken;
    }

    public void setPushNotificationToken(String pushNotificationToken) {
        this.pushNotificationToken = pushNotificationToken;
    }

    public String getLoginType() {
        return loginType;
    }

    public void setLoginType(String loginType) {
        this.loginType = loginType;
    }

    public String getReferalCode() {
        return referalCode;
    }

    public void setReferalCode(String referalCode) {
        this.referalCode = referalCode;
    }

    public Integer getCabLatitude() {
        return cabLatitude;
    }

    public void setCabLatitude(Integer cabLatitude) {
        this.cabLatitude = cabLatitude;
    }

    public Integer getCabLongitude() {
        return cabLongitude;
    }

    public void setCabLongitude(Integer cabLongitude) {
        this.cabLongitude = cabLongitude;
    }

    public Integer getBuildId() {
        return buildId;
    }

    public void setBuildId(Integer buildId) {
        this.buildId = buildId;
    }

    public Integer getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(Integer deviceName) {
        this.deviceName = deviceName;
    }

    private String deviceType;
    private Integer deviceVersion;
    private String language;
    private String message;
    private Integer iPAddress;
    private Integer appVersion;
    private String deviceMac;
    private String deviceModel;
    private String customerType;
    private String pushNotificationToken;
    private String loginType;
    private String referalCode;
    private Integer cabLatitude;
    private Integer cabLongitude;
    private Integer buildId;
    private Integer deviceName;

    public device_model(Integer deviceId, String deviceType, Integer deviceVersion, String language, String message, Integer iPAddress, Integer appVersion, String deviceMac, String deviceModel, String customerType, String pushNotificationToken, String loginType, String referalCode, Integer cabLatitude, Integer cabLongitude, Integer buildId, Integer deviceName) {
        this.deviceId = deviceId;
        this.deviceType = deviceType;
        this.deviceVersion = deviceVersion;
        this.language = language;
        this.message = message;
        this.iPAddress = iPAddress;
        this.appVersion = appVersion;
        this.deviceMac = deviceMac;
        this.deviceModel = deviceModel;
        this.customerType = customerType;
        this.pushNotificationToken = pushNotificationToken;
        this.loginType = loginType;
        this.referalCode = referalCode;
        this.cabLatitude = cabLatitude;
        this.cabLongitude = cabLongitude;
        this.buildId = buildId;
        this.deviceName = deviceName;
    }
}







