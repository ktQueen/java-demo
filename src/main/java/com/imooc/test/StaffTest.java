package com.imooc.test;

import com.imooc.model.Department;
import com.imooc.model.Position;
import com.imooc.model.Staff;

public class StaffTest {
    public static void main(String[] args) {
        Position p1 = new Position("P001", "经理");
        Position p2 = new Position("P002", "助理");
        Position p3 = new Position("P003", "职员");

        Department d1 = new Department("D001", "人事部");
        Department d2 = new Department("D002", "市场部");

        System.out.println("=============================");
        Staff staff1 = new Staff("张铭", "S001", 29, "男", d1, p1);
        System.out.println(staff1.info());

        System.out.println("=============================");
        Staff staff2 = new Staff("李艾爱", "S002", 21, "女", d1, p2);
        System.out.println(staff2.info());

        System.out.println("=============================");
        Staff staff3 = new Staff("孙超", "S003", 29, "男", d1, p3);
        System.out.println(staff3.info());

        System.out.println("=============================");
        Staff staff4 = new Staff("张美美", "S004", 26, "女", d2, p3);
        System.out.println(staff4.info());

        System.out.println("=============================");
        Staff staff5 = new Staff("蓝迪", "S005", 37, "男", d2, p1);
        System.out.println(staff5.info());

        System.out.println("=============================");
        Staff staff6 = new Staff("米粒", "S006", 24, "女", d2, p3);
        System.out.println(staff6.info());


        System.out.println("=============================");
//        d1.addStaff(staff1);
//        d1.addStaff(staff2);
//        d1.addStaff(staff3);
//        d2.addStaff(staff4);
//        d2.addStaff(staff5);
//        d2.addStaff(staff6);
        System.out.println(d1.getDepartmentName() + "总共有" + d1.getDepartmentStaffNum() + "名员工");
        System.out.println(d2.getDepartmentName() + "总共有" + d2.getDepartmentStaffNum() + "名员工");

    }
}
