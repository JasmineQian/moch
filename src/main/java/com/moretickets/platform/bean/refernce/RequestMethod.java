package com.moretickets.platform.bean.refernce;

public class RequestMethod {

    private Integer id;
    private String Method;
    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMethod() {
        return Method;
    }

    public void setMethod(String method) {
        Method = method;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "RequestMethod{" +
                "id=" + id +
                ", Method='" + Method + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
