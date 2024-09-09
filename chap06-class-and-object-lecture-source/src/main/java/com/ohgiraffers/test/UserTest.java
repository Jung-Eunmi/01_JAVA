package com.ohgiraffers.test;

public class UserTest {

    /*인스턴스 변수 : 아이디, 비밀번호, 이름, 나이, 성별, 전화번호, 이메일 */
    private String id;
    private String pwd;
    private String name;
    private int age;
    private char gender;
    private String call;
    private String mail;

    public UserTest(){ }
    public UserTest(String id, String pwd, String name, int age, char gender, String call, String mail) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.call = call;
        this.mail = mail;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getCall() {
        return call;
    }

    public void setCall(String call) {
        this.call = call;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "UserTest{" +
                "id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", call='" + call + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }
}
