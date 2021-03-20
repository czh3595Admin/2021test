package com.czh.pojo;



public class User {

    private String name;

    private Integer age;

    private String sex;

    private Long aaa;


    private String test;

    private String zzz;

    private String bbb;

    private Boolean xxx;

    public User(String name, Integer age, String sex, Long aaa, String test, String zzz, String bbb, Boolean xxx) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.aaa = aaa;
        this.test = test;
        this.zzz = zzz;
        this.bbb = bbb;
        this.xxx = xxx;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", aaa=" + aaa +
                ", test='" + test + '\'' +
                ", zzz='" + zzz + '\'' +
                ", bbb='" + bbb + '\'' +
                ", xxx=" + xxx +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Long getAaa() {
        return aaa;
    }

    public void setAaa(Long aaa) {
        this.aaa = aaa;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public String getZzz() {
        return zzz;
    }

    public void setZzz(String zzz) {
        this.zzz = zzz;
    }

    public String getBbb() {
        return bbb;
    }

    public void setBbb(String bbb) {
        this.bbb = bbb;
    }

    public Boolean getXxx() {
        return xxx;
    }

    public void setXxx(Boolean xxx) {
        this.xxx = xxx;
    }
}
