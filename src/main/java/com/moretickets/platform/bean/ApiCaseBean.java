package com.moretickets.platform.bean;

public class ApiCaseBean {

    private Integer id;
    private Integer apiId;
    private String name;
    private String body;
    private String asseertion;
    private Integer methodId;
    private Integer priorityId;
    private Integer passId;
    private boolean deleteflag;
    private String memo;
    private String createdt;
    private String updatedt;
    private Integer casetypeId;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAsseertion() {
        return asseertion;
    }

    public void setAsseertion(String asseertion) {
        this.asseertion = asseertion;
    }

    public Integer getMethodId() {
        return methodId;
    }

    public void setMethodId(Integer methodId) {
        this.methodId = methodId;
    }

    public Integer getPriorityId() {
        return priorityId;
    }

    public void setPriorityId(Integer priorityId) {
        this.priorityId = priorityId;
    }

    public Integer getPassId() {
        return passId;
    }

    public void setPassId(Integer passId) {
        this.passId = passId;
    }

    public boolean isDeleteflag() {
        return deleteflag;
    }

    public void setDeleteflag(boolean deleteflag) {
        this.deleteflag = deleteflag;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
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

    public Integer getCasetypeId() {
        return casetypeId;
    }

    public void setCasetypeId(Integer casetypeId) {
        this.casetypeId = casetypeId;
    }

    @Override
    public String toString() {
        return "ApiCaseBean{" +
                "id=" + id +
                ", apiId=" + apiId +
                ", name='" + name + '\'' +
                ", body='" + body + '\'' +
                ", asseertion='" + asseertion + '\'' +
                ", methodId=" + methodId +
                ", priorityId=" + priorityId +
                ", passId=" + passId +
                ", deleteflag=" + deleteflag +
                ", memo='" + memo + '\'' +
                ", createdt='" + createdt + '\'' +
                ", updatedt='" + updatedt + '\'' +
                ", casetypeId=" + casetypeId +
                '}';
    }
}
