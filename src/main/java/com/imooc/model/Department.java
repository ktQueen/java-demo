package com.imooc.model;

public class Department {
    private String departmentNo;
    private String departmentName;
    private Staff[] departmentStaff;
    private int departmentStaffNum;

    public Department() {

    }

    public Department(String departmentNo, String departmentName) {
        this.setDepartmentNo(departmentNo);
        this.setDepartmentName(departmentName);
    }

    public Department(String departmentNo, String departmentName, Staff[] departmentStaff, int departmentStaffNum) {
        this.setDepartmentNo(departmentNo);
        this.setDepartmentName(departmentName);
        this.setDepartmentStaff(departmentStaff);
        this.setDepartmentStaffNum(departmentStaffNum);
    }

    public String getDepartmentNo() {
        return departmentNo;
    }

    public void setDepartmentNo(String departmentNo) {
        this.departmentNo = departmentNo;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Staff[] getDepartmentStaff() {
        if (this.departmentStaff == null) {
            this.departmentStaff = new Staff[200];
        }
        return departmentStaff;
    }

    public void setDepartmentStaff(Staff[] departmentStaff) {
        this.departmentStaff = departmentStaff;
    }

    public int getDepartmentStaffNum() {
        return departmentStaffNum;
    }

    public void setDepartmentStaffNum(int departmentStaffNum) {
        this.departmentStaffNum = departmentStaffNum;
    }

    public void addStaff(Staff staff) {
        for (int i = 0; i < this.getDepartmentStaff().length; i++) {
            if (this.getDepartmentStaff()[i] == null) {
                this.getDepartmentStaff()[i] = staff;
                this.departmentStaffNum = i + 1;
                return;
            }
        }
    }
}
