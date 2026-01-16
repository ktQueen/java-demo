package org.example.array;

import java.util.Scanner;

public class StudentScore {
    static StudentScore studentScore;
    float[] scoreArray = new float[0];

    public static void main(String[] args) {
        studentScore = new StudentScore();
        studentScore.init();
    }


    public void init() {
        studentScore.displayMenu();
        Scanner sc1 = new Scanner(System.in);
        var n = sc1.nextInt();
        switch (n) {
            case 0:
                break;
            case 1:
                scoreArray = intScore();
                studentScore.init();
                break;
            case 2:
                if (scoreArray.length > 0) {
                    System.out.println("数学平均成绩为：" + studentScore.average(scoreArray));
                } else {
                    System.out.println("请先初始化数据");
                }
                studentScore.init();
                break;
            case 3:
                if (scoreArray.length > 0) {
                    System.out.println("成绩大于85分的人数为：" + studentScore.count(scoreArray));
                } else {
                    System.out.println("请先初始化数据");
                }
                studentScore.init();
                break;
            case 4:
                if (scoreArray.length > 0) {
                    System.out.println("修改前：");
                    System.out.println("成绩为：");
                    studentScore.displayAllScore(scoreArray);
                    System.out.println("请输入要修改数据的位置（从0开始）：");
                    Scanner sc2 = new Scanner(System.in);
                    int m = sc2.nextInt();
                    System.out.println("请输入新数据：");
                    Scanner sc3 = new Scanner(System.in);
                    float k = sc3.nextFloat();
                    studentScore.update(scoreArray, m, k);
                    System.out.println("修改后：");
                    System.out.println("成绩为：");
                    studentScore.displayAllScore(scoreArray);
                } else {
                    System.out.println("请先初始化数据");
                }
                studentScore.init();
                break;
            case 5:
                if (scoreArray.length > 0) {
                    studentScore.displayAllScore(scoreArray);
                } else {
                    System.out.println("请先初始化数据");
                }
                studentScore.init();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + n);
        }
    }


    public void displayMenu() {
        System.out.println("**********************************");
        System.out.println("1--初始化数学成绩");
        System.out.println("2--求成绩的平均值");
        System.out.println("3--统计成绩大于85分的人数");
        System.out.println("4--修改指定位置处的成绩");
        System.out.println("5--打印输出所有成绩");
        System.out.println("0--退出");
        System.out.println("**********************************");
        System.out.println("请输入对应的数字进行操作：");
    }

    public float[] intScore() {
        System.out.println("请输入要存储的数学成绩的数量：");
        Scanner sc2 = new Scanner(System.in);
        int n = sc2.nextInt();
        float[] scoreArr = new float[n];
        for (var i = 0; i < n; i++) {
            System.out.println("请输入第" + (i + 1) + "个数据：");
            Scanner sc3 = new Scanner(System.in);
            scoreArr[i] = sc3.nextFloat();
        }
        return scoreArr;
    }

    public float average(float[] f) {
        var sum = 0;
        for (float n : f) {
            sum += n;
        }
        var s = sum / f.length;
        return s;
    }

    public int count(float[] f) {
        int count = 0;
        for (float n : f) {
            if (n > 85) {
                count++;
            }
        }
        return count;
    }

    public void update(float[] f, int index, float newScore) {
        f[index] = newScore;
    }

    public void displayAllScore(float[] f) {
        for (float i : f) {
            System.out.print(i + "   ");
        }
        System.out.println("");
    }
}
