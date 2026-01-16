package com.imooc.model;

public class Subject {
    //成员属性：学科名称、学科编号、学制年限
    private String subjectName;
    private String subjectNo;
    private int subjectLife;
    private Student[] myStudents;
    private int studentNum;

    //无参构造方法
    public Subject() {
    }

    //有参构造方法
    public Subject(String subjectName, String subjectNo, int subjectLife) {
        this.setSubjectName(subjectName);
        this.setSubjectNo(subjectNo);
        this.setSubjectLife(subjectLife);
    }

    //有参构造方法
    public Subject(String subjectName, String subjectNo, int subjectLife, Student[] myStudents) {
        this.setSubjectName(subjectName);
        this.setSubjectNo(subjectNo);
        this.setSubjectLife(subjectLife);
        this.setMyStudents(myStudents);
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getSubjectNo() {
        return subjectNo;
    }

    public void setSubjectNo(String subjectNo) {
        this.subjectNo = subjectNo;
    }

    public int getSubjectLife() {
        return subjectLife;
    }

    public void setSubjectLife(int subjectLife) {
        if (subjectLife <= 0) {
            return;
        }
        this.subjectLife = subjectLife;
    }

    public Student[] getMyStudents() {
        if (this.myStudents == null) {
            this.myStudents = new Student[200];
        }
        return myStudents;
    }

    public void setMyStudents(Student[] myStudents) {
        this.myStudents = myStudents;
    }


    public int getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(int studentNum) {
        this.studentNum = studentNum;
    }

    public String info() {
        String str = "专业信息如下：\n专业名称:" + this.getSubjectName() +
                "\n专业编号:" + this.getSubjectNo() +
                "\n学制年限:" + this.getSubjectLife() + "年" +
                "\n";
        return str;
    }

    public void addStudent(Student stu) {
        for (int i = 0; i < this.getMyStudents().length; i++) {
            if (this.getMyStudents()[i] == null) {
                stu.setStudentSubject(this);
                this.getMyStudents()[i] = stu;
                this.studentNum = i + 1;
                return;
            }
        }
    }
}
