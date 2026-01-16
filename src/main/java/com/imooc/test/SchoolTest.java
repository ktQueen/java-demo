package com.imooc.test;

import com.imooc.model.Student;
import com.imooc.model.Subject;

public class SchoolTest {
    public static void main(String[] args) {
        System.out.println("=============================");
        Subject sub1 = new Subject("计算机科学与应用", "J0001", 4);
        System.out.println(sub1.info());

        System.out.println("=============================");
        Student s1 = new Student("S01", "张三", "男", 18, sub1);
        System.out.println(s1.introduction());

        System.out.println("=============================");
        Student s2 = new Student("S02", "李四", "女", 17);
        System.out.println(s2.introduction("计算机科学与应用1", 3));

        System.out.println("=============================");
        Student s3 = new Student("S03", "王五", "男", 18);
        System.out.println(s3.introduction(sub1));

        System.out.println("=============================");
        sub1.addStudent(s1);
        sub1.addStudent(s2);
        sub1.addStudent(s3);
        System.out.println(sub1.getSubjectName() + "的专业中已有" + sub1.getStudentNum() + "名学生进行了报名");
    }
}
