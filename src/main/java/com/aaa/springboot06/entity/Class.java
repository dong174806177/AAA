package com.aaa.springboot06.entity;

public class Class {
    private Integer c_id;
    private String  c_name;
    private Integer g_id;
    private String g_name;

    public Integer getC_id() {
        return c_id;
    }

    public void setC_id(Integer c_id) {
        this.c_id = c_id;
    }

    public String getC_name() {
        return c_name;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name;
    }

    public Integer getG_id() {
        return g_id;
    }

    public void setG_id(Integer g_id) {
        this.g_id = g_id;
    }

    public String getG_name() {
        return g_name;
    }

    public void setG_name(String g_name) {
        this.g_name = g_name;
    }

    @Override
    public String toString() {
        return "Class{" +
                "c_id=" + c_id +
                ", c_name='" + c_name + '\'' +
                ", g_id=" + g_id +
                ", g_name='" + g_name + '\'' +
                '}';
    }
}
