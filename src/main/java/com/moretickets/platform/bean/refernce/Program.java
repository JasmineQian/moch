package com.moretickets.platform.bean.refernce;

public class Program {

    private Integer pid;
    private String pname;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    @Override
    public String toString() {
        return "Program{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                '}';
    }
}
