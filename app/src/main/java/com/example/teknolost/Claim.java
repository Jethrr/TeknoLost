package com.example.teknolost;

public class Claim {
    public String claimantUserId;
    public long claimDate;
    public String status;

    public Claim() {

    }

    public Claim(String claimantUserId, long claimDate, String status) {
        this.claimantUserId = claimantUserId;
        this.claimDate = claimDate;
        this.status = status;
    }


}
