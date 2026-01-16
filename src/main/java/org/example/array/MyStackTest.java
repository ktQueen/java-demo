package org.example.array;

public class MyStackTest {
    public static void main(String[] args) {

        //创建一个栈对象，初始化容量是10个.
        MyStack stack=new MyStack();

        //调用方法压栈
        stack.push(new Object());
        stack.push(new Object());
        stack.push(new Object());
        stack.push(new Object());
        stack.push(new Object());
        stack.push(new Object());
        stack.push(new Object());
        stack.push(new Object());
        stack.push(new Object());
        stack.push(new Object());
        stack.push(new Object());
        stack.push(new Object());

        //弹栈
        stack.pop();
    }
}
