package com.imooc.model;

public class Student {
    //成员属性：学号、姓名、性别、年龄
    private String studentNo;
    private String studentName;
    private String studentSex;
    private int studentAge;
    private Subject studentSubject;

    public Student() {
    }

    public Student(String studentNo, String studentName, String studentSex, int studentAge) {
        this.setStudentNo(studentNo);
        this.setStudentName(studentName);
        this.setStudentSex(studentSex);
        this.setStudentAge(studentAge);
    }

    public Student(String studentNo, String studentName, String studentSex, int studentAge, Subject studentSubject) {
        this.setStudentNo(studentNo);
        this.setStudentName(studentName);
        this.setStudentSex(studentSex);
        this.setStudentAge(studentAge);
        this.setStudentSubject(studentSubject);
    }

    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentSex() {
        return studentSex;
    }

    public void setStudentSex(String studentSex) {
        //限制性别
        if (studentSex.equals("女")) {
            this.studentSex = "女";
        } else {
            this.studentSex = "男";
        }
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        if (studentAge < 10 || studentAge > 100) {
            this.studentAge = 18;
        } else {
            this.studentAge = studentAge;
        }
    }

    public Subject getStudentSubject() {
        if (this.studentSubject == null) {
            this.studentSubject = new Subject();
        }
        return studentSubject;
    }

    public void setStudentSubject(Subject studentSubject) {
        this.studentSubject = studentSubject;
    }

    public String introduction() {
        String str = "学生信息如下：\n姓名：" + this.getStudentName() +
                "\n学号：" + this.getStudentNo() +
                "\n性别：" + this.getStudentSex() +
                "\n年龄：" + this.getStudentAge() +
                "\n所报专业名称：" + this.getStudentSubject().getSubjectName() +
                "\n学制年限：" + this.getStudentSubject().getSubjectLife();
        return str;
    }

    public String introduction(String subjectName, int subjectLife) {
        String str = "学生信息如下：\n姓名：" + this.getStudentName() +
                "\n学号：" + this.getStudentNo() +
                "\n性别：" + this.getStudentSex() +
                "\n年龄：" + this.getStudentAge() +
                "\n所报专业名称：" + subjectName +
                "\n学制年限：" + subjectLife;
        return str;
    }

    public String introduction(Subject mySubject) {
        String str = "学生信息如下：\n姓名：" + this.getStudentName() +
                "\n学号：" + this.getStudentNo() +
                "\n性别：" + this.getStudentSex() +
                "\n年龄：" + this.getStudentAge() +
                "\n所报专业名称：" + mySubject.getSubjectName() +
                "\n学制年限：" + mySubject.getSubjectLife();
        return str;
    }
}
