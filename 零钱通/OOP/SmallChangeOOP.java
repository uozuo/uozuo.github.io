package 零钱通.OOP;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeOOP {
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
    //完成菜单
    public void MainMenu(){
        do {
            System.out.print("------零钱通菜单------");
            System.out.println("\n" + "\t" + "1 零钱通明细" + "\n" + "\t" + "2 收益入账" + "\n" + "\t" + "3 消费" + "\n" + "\t" + "4 退出");
            System.out.println("请选择（1-4）：");
            int input = sc.nextInt();
            switch (input) {
                case 1:
                    this.Deatil();
                    break;
                case 2:
                    this.Income();
                    break;
                case 3:
                    this.Pay();
                    break;
                case 4:
                    this.exit();
                    break;
                default:
                    System.out.println("你的输入有误");
            }
        } while (loop);
    }
    //完成明细
    public void Deatil(){
        System.out.println(details);
    }
    //收入
    public void Income(){
        System.out.println("收益入账金额：");
        money = sc.nextDouble();
        if (money<0){
            System.out.println("收入金额需要大于0");
            return;//退出方法不再执行后面的代码
        }
        //money的值需要校验
        balance += money;
        //拼接收入入账信息
        details += "\n收益入账+\t+" + money + "\t" + sdf.format(date) + "\t" + balance;
    }
    //消费
    public void Pay(){
        System.out.println("消费金额：");
        money = sc.nextDouble();
        //范围校验
        if (money<=0||money>balance){
            System.out.println("你的消费金额应该在0-"+balance+"之间！！");
           return;
        }
        System.out.println("请输入消费说明：");
        note = sc.next();
        balance -= money;
        details += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t" + balance;
    }
    public void exit(){
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
    }
}
