package 零钱通;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChange {
    public static void main(String[] args) {
        boolean loop = true;
        Scanner sc = new Scanner(System.in);
        //完成零钱通明细
        String details = "------零钱通明细------";
        //完成收益入账
        double money = 0;//收入
        double balance = 0;//余额
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");//用于格式化日期
        //完成消费
        String note = " ";
        do {
            System.out.print("------零钱通菜单------");
            System.out.println("\n" + "\t" + "1 零钱通明细" + "\n" + "\t" + "2 收益入账" + "\n" + "\t" + "3 消费" + "\n" + "\t" + "4 退出");
            System.out.println("请选择（1-4）：");
            int input = sc.nextInt();
            switch (input) {
                case 1:
                    System.out.println(details);
                    break;
                case 2:
                    System.out.println("收益入账金额：");
                    money = sc.nextDouble();
                    if (money<0){
                        System.out.println("收入金额需要大于0");
                        break;
                    }
                    //money的值需要校验
                    balance += money;
                    //拼接收入入账信息
                    details += "\n收益入账+\t+" + money + "\t" + sdf.format(date) + "\t" + balance;
                    break;
                case 3:
                    System.out.println("消费金额：");
                    money = sc.nextDouble();
                    //范围校验
                    if (money<=0||money>balance){
                        System.out.println("你的消费金额应该在0-"+balance+"之间！！");
                        break;
                    }
                    System.out.println("请输入消费说明：");
                    note = sc.next();
                    balance -= money;
                    details += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t" + balance;
                    break;
                case 4:
                    String choice = " ";
                    while (true) {
                        //要求用户必须输入y/n，否则就一直循环
                        System.out.println("你确定要退出吗？y/n");
                        choice = sc.next();
                        if (choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("n")) {
                            break;
                        }
                    }
                    if (choice.equalsIgnoreCase("y")) {
                        loop = false;
                    }
                    break;
                default:
                    System.out.println("你的输入有误");
            }
        } while (loop);
        System.out.println("------零钱通已经退出------");
    }
}
