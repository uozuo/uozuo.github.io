package chapter2;

import java.util.Scanner;

public class 斐波那契数列 {
    public static void main(String[] args) {
        System.out.println("请输入想看第几位：");
        Scanner sc = new Scanner(System.in);
        int Sc = sc.nextInt();
        T t = new T();
        int res = t.fibonacci(Sc);
        if (res != -1) {
            System.out.println("斐波那契第" + Sc + "个是" + t.fibonacci(Sc));
        } else {
            System.out.println("你输入的数字必须是大于等于1的整数！！！\n请重新输入！！！");
        }
    }
}

class T {
    public int fibonacci(int n) {
        if (n >= 1) {
            if (n == 1 || n == 2) {
                return 1;
            } else {
                return fibonacci(n - 1) + fibonacci(n - 2);
            }
        } else {
            return -1;
        }
    }
}

