package org.example.student;

import java.util.Objects;

/*
 * 学生业务类
 * */
public class Student {
    private int no;
    private String name;
    private String birth;
    private String gender;
    private String phone;

    public Student() {
    }

    public Student(int no, String name, String birth, String gender, String phone) {
        this.no = no;
        this.name = name;
        this.birth = birth;
        this.gender = gender;
        this.phone = phone;
    }

    public Student(String name, String birth, String gender, String phone) {
        this.name = name;
        this.birth = birth;
        this.gender = gender;
        this.phone = phone;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Student{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", birth='" + birth + '\'' +
                ", gender='" + gender + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return no == student.no;
    }

    @Override
    public int hashCode() {
        return Objects.hash(no, name, birth, gender, phone);
    }
}
