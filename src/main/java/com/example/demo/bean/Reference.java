package com.example.demo.bean;

public class Reference {

    private Integer referId;
    private String referName;
    private Integer referGid;

    public Integer getReferId() {
        return referId;
    }

    public void setReferId(Integer referId) {
        this.referId = referId;
    }

    public String getReferName() {
        return referName;
    }

    public void setReferName(String referName) {
        this.referName = referName;
    }

    public Integer getReferGid() {
        return referGid;
    }

    public void setReferGid(Integer referGid) {
        this.referGid = referGid;
    }


    @Override
    public String toString() {
        return "Reference{" +
                "referId=" + referId +
                ", referName='" + referName + '\'' +
                ", referGid=" + referGid +
                '}';
    }
}
