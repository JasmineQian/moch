package com.moretickets.platform.bean;

public class ApiInfoBean {

    private int id;
    private int pid;
    private String projectname;
    private String name;
    private String hostname;
    private String path;
    private int method;
    private String memo;
    private String createdt;
    private String updatedt;
    private String createuid;
    private String updateuid;

    public ApiInfoBean() {
        super();
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int getMethod() {
        return method;
    }

    public void setMethod(int method) {
        this.method = method;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }


    public String getUpdatedt() {
        return updatedt;
    }

    public void setUpdatedt(String updatedt) {
        this.updatedt = updatedt;
    }

    public String getCreatedt() {
        return createdt;
    }

    public void setCreatedt(String createdt) {
        this.createdt = createdt;
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
        return "ApiInfoBean{" +
                "id=" + id +
                ", pid=" + pid +
                ", projectname='" + projectname + '\'' +
                ", name='" + name + '\'' +
                ", hostname='" + hostname + '\'' +
                ", path='" + path + '\'' +
                ", method=" + method +
                ", memo='" + memo + '\'' +
                ", createdt='" + createdt + '\'' +
                ", updatedt='" + updatedt + '\'' +
                ", createuid='" + createuid + '\'' +
                ", updateuid='" + updateuid + '\'' +
                '}';
    }
}
