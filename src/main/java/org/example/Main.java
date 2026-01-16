package org.example;

//import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("hello world");
    }
}

    /*    // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press Ctrl+R or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Ctrl+D to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Cmd+F8.
            System.out.println("i = " + i);
        }*/

        /*//------用户接收键盘输入-------
        //创建Scanner对象
        Scanner scanner = new Scanner(System.in);
        //读取字符串
        System.out.print("请输入您的名字：");
        String name = scanner.nextLine();
        //读取整数
        System.out.print("请输入您的年龄：");
        int age = scanner.nextInt();
        //读取浮点数
        System.out.print("请输入您的身高（米）：");
        double height = scanner.nextDouble();
        //输出
        System.out.println("您的信息是：");
        System.out.println("姓名：" + name);
        System.out.println("年龄：" + age);
        System.out.println("身高：" + height + "米");
        //关闭scanner
        scanner.close();*/

        /*//-----求1-100所有的奇数的和
        int sum = 0;
        for (int i = 1; i <= 100; i=i+2) {
            sum += i;
        }
        System.out.print("1-100所有的奇数的和：" + sum);*/

       /* //计算1000以内所有不能被7整除的整数之和
        int sum = 0;
        for (int i = 0; i <= 1000; i++) {
            if (i % 7 != 0) {
                sum += i;
            }
        }
        System.out.print("1000以内所有不能被7整除的整数之和：" + sum);*/

        /*//计算1+2-3+4-5+6-7...+100的结果
        int sum = 1;
        for (int i = 2; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            } else {
                sum -= i;
            }
        }
        System.out.print("1+2-3+4-5+6-7...+100的结果：" + sum);*/

        /*//从控制台输入一个正整数，计算该数的阶乘。例如输入5，阶乘为5*4*3*2*1
        //java.util.Scanner s=new java.util.Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个正整数：");
        int a = scanner.nextInt();
        int sum = 1;
        String str = "";
        for (int i = a; i > 0; i--) {
            str += i + "*";
            sum *= i;
        }
        System.out.print(a + "的阶乘为：" + str + "=" + sum);*/

       /* //从控制台接收一个正整数，判断该数字是否为质数（质数是指在大于1的自然数中，除了1和它本身以外不再有其他因数的自然数）
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个正整数：");
        int a = scanner.nextInt();
        boolean flag = true;
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                flag = false;
                break;//为了效率这里要加一个break
            }
        }
        System.out.print(a + (flag ? "是" : "不是") + "质数");*/

        /*//从键盘接收一个正整数，该正整数作为行数，输出以下图形
//            *
//           ***
//          *****
//         *******
//        *********
//        例如：输入5，则打印如上图5行
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个正整数：");
        int a = scanner.nextInt();
        for (int i = 0; i < a; i++) {
            String str = "";
            for (int j = 1; j < a - i; j++) {
                str += " ";
            }
            for (int j = 1; j <= 2 * i + 1; j++) {
                str += "*";
            }
            System.out.print(str);
            System.out.println();
        }*/

        /*//小芳的妈妈每天给她2.5元钱，她都会存起来，但是，每当这一天是存钱的第5天或者5的倍数的话，她都会去花去6元钱，请问，经过多少天，小芳才可以存到100元钱
        double sum = 0;
        int i = 0;
        while (sum < 100) {
            i++;
            sum += 2.5;
            if (i % 5 == 0) {
                sum -= 6.0;
            }
        }
        System.out.print("通过" + i + "天存了" + sum + "元钱");*/

        /*//一个数如果恰好等于它的因子之和，这个数就是完数，例如6=1+2+3，编程找出1000内所有的完数
        for (int i = 2; i <= 1000; i++) {
            int sum = 0;
            for (int j = 1; j < i / 2; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (i == sum) {
                System.out.println(i);
            }
        }*/
      /*  System.out.println(jc(5));
        System.out.println(minZhishu(7));*/

//带有static的方法
//没有static的方法
//分别怎么调用？
//带有static的方法怎么调用？通过“类名.”的方法访问。

//对象被称为实例。
//实例相关的有：实例变量、实例方法。
//实例变量是对象变量。实例方法是对象方法。
//实例相关的都需要先new对象，通过“引用.”的方式去访问。

//        Main.dosome();
//        //类名，可以省略（在同一个类中。）
//        dosome();
//尝试使用“类名.”的方式访问“实例方法”。
//错误的
//Main.doOther();

//        //创建对象
//        Main t1=new Main();
//        //通过“引用.”的方式访问实例方法。
//        t1.doOther();

/*
    public static int jc(int i) {
        int result = 1;
        for (int j = i; j > 0; j--) {
            result = j * result;
        }
        return result;
    }*/

  /*  public static int minZhishu(int i) {
        boolean flag=false;
        i++;
        for (int j = i-1; j > 1; j--) {
            if (i % j == 0) {
                flag=true;
            }
        }
        if (flag) {
            return minZhishu(i++);

        } else {
            return i;
        }
    }*/


//    //带有static
//    public static void dosome() {
//        System.out.println("do some!");
//    }
//
//    //这个方法没有static ，这样的方法被称为：实例方法。（对象方法，对象级别的方法）
//    //这个没法解释，大家目前死记硬背。
//    public void doOther() {
//        System.out.println("do other.....");
//    }
//
//    @Override
//    public String toString() {
//        return super.toString();
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        return super.equals(obj);
//    }
//}

