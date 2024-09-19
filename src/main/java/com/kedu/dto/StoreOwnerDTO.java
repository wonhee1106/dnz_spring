package com.kedu.dto;

public class StoreOwnerDTO {
    private int ownerId;
    private String businessNumber;
    private String representativeName;
    private String storeAddress;
    private String businessType;
    private String userId;

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public String getBusinessNumber() {
        return businessNumber;
    }

    public void setBusinessNumber(String businessNumber) {
        this.businessNumber = businessNumber;
    }

    public String getRepresentativeName() {
        return representativeName;
    }

    public void setRepresentativeName(String representativeName) {
        this.representativeName = representativeName;
    }

    public String getStoreAddress() {
        return storeAddress;
    }

    public void setStoreAddress(String storeAddress) {
        this.storeAddress = storeAddress;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }


    public StoreOwnerDTO(int ownerId, String businessNumber, String representativeName, String storeAddress, String businessType, String userId) {
        this.ownerId = ownerId;
        this.businessNumber = businessNumber;
        this.representativeName = representativeName;
        this.storeAddress = storeAddress;
        this.businessType = businessType;
        this.userId = userId;
    }

    public StoreOwnerDTO() {}


}