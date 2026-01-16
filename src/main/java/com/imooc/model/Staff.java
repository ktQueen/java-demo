package com.imooc.model;

public class Staff {
    private String staffName;
    private String staffNo;
    private int staffAge;
    private String staffSex;
    private Department staffDepartment;
    private Position staffPosition;

    public Staff() {

    }

    public Staff(String staffName, String staffNo, int staffAge, String staffSex, Department staffDepartment, Position staffPosition) {
        this.setStaffName(staffName);
        this.setStaffNo(staffNo);
        this.setStaffAge(staffAge);
        this.setStaffSex(staffSex);
        this.setStaffDepartment(staffDepartment);
        this.setStaffPosition(staffPosition);
    }

    public String getStaffName() {
        return this.staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getStaffNo() {
        return this.staffNo;
    }

    public void setStaffNo(String staffNo) {
        this.staffNo = staffNo;
    }

    public int getStaffAge() {
        return this.staffAge;
    }

    public void setStaffAge(int staffAge) {
        if (staffAge < 18 && staffAge > 65) {
            this.staffAge = 18;
        } else {
            this.staffAge = staffAge;
        }
    }

    public String getStaffSex() {
        return this.staffSex;
    }

    public void setStaffSex(String staffSex) {
        if (staffSex.equals("女")) {
            this.staffSex = "女";
        } else {
            this.staffSex = "男";
        }
    }

    public String getStaffDepartment() {
        if (this.staffDepartment == null) {
            this.staffDepartment = new Department();
        }
        return this.staffDepartment.getDepartmentName();
    }

    public void setStaffDepartment(Department staffDepartment) {
        this.staffDepartment = staffDepartment;
        staffDepartment.addStaff(this);
    }

    public String getStaffPosition() {
        if (this.staffPosition == null) {
            this.staffPosition = new Position();
        }
        return this.staffPosition.getPositionName();
    }

    public void setStaffPosition(Position staffPosition) {
        this.staffPosition = staffPosition;
    }

    public String info() {
        String str = "姓名：" + this.getStaffName() + "\n" +
                "工号：" + this.getStaffNo() + "\n" +
                "性别：" + this.getStaffSex() + "\n" +
                "年龄：" + this.getStaffAge() + "\n" +
                "职务：" + this.getStaffDepartment() + this.getStaffPosition() + "\n";
        return str;
    }
}
