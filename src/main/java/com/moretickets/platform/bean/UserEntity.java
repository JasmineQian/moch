package com.moretickets.platform.bean;

import java.util.List;

public class UserEntity {

    private Long id;
    private String username;
    private String password;
    private String fullname;
    private String email;
    private List programs;
    private String roles;
    private String creationdt;
    private String updatedt;
    private boolean activeFlag;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List getPrograms() {
        return programs;
    }

    public void setPrograms(List programs) {
        this.programs = programs;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public String getCreationdt() {
        return creationdt;
    }

    public void setCreationdt(String creationdt) {
        this.creationdt = creationdt;
    }

    public String getUpdatedt() {
        return updatedt;
    }

    public void setUpdatedt(String updatedt) {
        this.updatedt = updatedt;
    }

    public boolean isActiveFlag() {
        return activeFlag;
    }

    public void setActiveFlag(boolean activeFlag) {
        this.activeFlag = activeFlag;
    }


    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", fullname='" + fullname + '\'' +
                ", email='" + email + '\'' +
                ", programs=" + programs +
                ", roles='" + roles + '\'' +
                ", creationdt='" + creationdt + '\'' +
                ", updatedt='" + updatedt + '\'' +
                ", activeFlag=" + activeFlag +
                '}';
    }
}
