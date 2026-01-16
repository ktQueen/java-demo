package org.example.student;

public class StudentService {

    private static int generateNo = 0;
    private Student[] students = new Student[10];

    public StudentService() {
        students[0] = new Student(++generateNo, "张三1", "1991-12-12", "男", "12345678910");
        students[1] = new Student(++generateNo, "张三2", "1991-12-12", "男", "12345678910");
        students[2] = new Student(++generateNo, "张三3", "1991-12-12", "男", "12345678910");
        students[3] = new Student(++generateNo, "张三4", "1991-12-12", "男", "12345678910");
        students[4] = new Student(++generateNo, "张三5", "1991-12-12", "男", "12345678910");
        students[5] = new Student(++generateNo, "张三6", "1991-12-12", "男", "12345678910");
        students[6] = new Student(++generateNo, "张三7", "1991-12-12", "男", "12345678910");
        students[7] = new Student(++generateNo, "张三8", "1991-12-12", "男", "12345678910");
        students[8] = new Student(++generateNo, "张三9", "1991-12-12", "男", "12345678910");
        students[9] = new Student(++generateNo, "张三10", "1991-12-12", "男", "12345678910");
    }

    public void displayAll() {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                System.out.println(students[i]);
            }
        }
    }

    public void displayByNo(int no) {
        for (Student student : students) {
            if (student.getNo() == no) {

                System.out.println(student);

                return;
            }
        }
    }

    public void add(Student student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                System.out.println("添加" + student.getNo() + "成功");
                return;
            }
        }
        Student[] newStudents = new Student[students.length * 2];
        System.arraycopy(students, 0, newStudents, 0, students.length);
        this.students = newStudents;
        this.students[this.students.length / 2] = student;
        System.out.println("添加" + student.getNo() + "成功");
    }

    public void deleteBuNo(int no) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getNo() == no) {
                students[i] = null;
                System.out.println("删除" + no + "成功");
                return;
            }
        }
    }

    public void modify(Student student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].equals(student)) {
                students[i] = student;
                System.out.println("修改" + student.getNo() + "成功");
                return;
            }
        }
    }
}
