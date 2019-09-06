package com.example.demo.bean;

public class ApiVarBean {

    private Integer id;
    private Integer apiId;
    private String val;
    private String valsample;
    private Integer InputFlag;
    private Integer InputSpecialTypeId;
    private String InputScope;
    private Integer InputTypeID;
    private Integer InputMaxLength;
    private String InputNote;
    private String createdt;
    private String updatedt;
    private String createuid;
    private String updateuid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getApiId() {
        return apiId;
    }

    public void setApiId(Integer apiId) {
        this.apiId = apiId;
    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }

    public String getValsample() {
        return valsample;
    }

    public void setValsample(String valsample) {
        this.valsample = valsample;
    }

    public Integer getInputFlag() {
        return InputFlag;
    }

    public void setInputFlag(Integer inputFlag) {
        InputFlag = inputFlag;
    }

    public Integer getInputSpecialTypeId() {
        return InputSpecialTypeId;
    }

    public void setInputSpecialTypeId(Integer inputSpecialTypeId) {
        InputSpecialTypeId = inputSpecialTypeId;
    }

    public String getInputScope() {
        return InputScope;
    }

    public void setInputScope(String inputScope) {
        InputScope = inputScope;
    }

    public Integer getInputTypeID() {
        return InputTypeID;
    }

    public void setInputTypeID(Integer inputTypeID) {
        InputTypeID = inputTypeID;
    }

    public Integer getInputMaxLength() {
        return InputMaxLength;
    }

    public void setInputMaxLength(Integer inputMaxLength) {
        InputMaxLength = inputMaxLength;
    }

    public String getInputNote() {
        return InputNote;
    }

    public void setInputNote(String inputNote) {
        InputNote = inputNote;
    }

    public String getCreatedt() {
        return createdt;
    }

    public void setCreatedt(String createdt) {
        this.createdt = createdt;
    }

    public String getUpdatedt() {
        return updatedt;
    }

    public void setUpdatedt(String updatedt) {
        this.updatedt = updatedt;
    }

    public String getCreateuid() {
        return createuid;
    }

    public void setCreateuid(String createuid) {
        this.createuid = createuid;
    }

    public String getUpdateuid() {
        return updateuid;
    }

    public void setUpdateuid(String updateuid) {
        this.updateuid = updateuid;
    }

    @Override
    public String toString() {
        return "ApiVarBean{" +
                "id=" + id +
                ", apiId=" + apiId +
                ", val='" + val + '\'' +
                ", valsample='" + valsample + '\'' +
                ", InputFlag=" + InputFlag +
                ", InputSpecialTypeId=" + InputSpecialTypeId +
                ", InputScope='" + InputScope + '\'' +
                ", InputTypeID=" + InputTypeID +
                ", InputMaxLength=" + InputMaxLength +
                ", InputNote='" + InputNote + '\'' +
                ", createdt='" + createdt + '\'' +
                ", updatedt='" + updatedt + '\'' +
                ", createuid='" + createuid + '\'' +
                ", updateuid='" + updateuid + '\'' +
                '}';
    }
}
