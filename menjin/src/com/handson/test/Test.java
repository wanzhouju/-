package com.handson.test;
import java.util.Scanner;  

import com.handson.sys.Computer;  
import com.handson.sys.Door;  
import com.handson.user.Admin;  
import com.handson.user.Guest; 
public class Test {
	public static void main(String[] args) {  
		  
        System.out.println("门禁系统的使用方法\n" + " 1.模拟输入密码：以“pa”开头，后跟密码\n"  
                + " 2.模拟刷卡：以“ca”开头，后跟卡号\n" + " 3.模拟取指纹：以“fi”开头，后跟表示指纹的字符串\n"  
                + " 4.模拟管理员按下开门按钮：输入“y”");  
        System.out  
                .println("***************************************************");  
        System.out.println("门禁系统启动");  
  
        System.out.println("门禁系统---访客测试");  
        System.out  
                .println("***************************************************");  
  
        Scanner in = new Scanner(System.in);  
        Door door = new Door();  
        boolean ban = true;  
        boolean bn = false;  
        Computer coputer = new Computer();  
        Admin admin = new Admin("王石头");  
        while (ban) {  
            System.out.println("请选择扮演的角色：1.来客  2.管理员 3.员工  其它：结束");  
            String n = in.next();  
            switch (Integer.parseInt(n)) {  
            case 1:  
                Guest guest = new Guest("赵强");  
                guest.pressRing(door); // 按门铃  
                bn = admin.work(door, guest); // 管理员监听门铃  
                /* 检查开门信号(监听门铃，响) */  
                break;  
            case 2:  
            case 3:  
                System.out.println("请输入验证信息：");  
                bn = coputer.validate(in.next());  
                break;  
            default:  
                ban = false;  
            }  
            if (bn) {  
                door.open(); // 开启电子门  
                System.out.println("-------^_^管理员 " + admin.getName()  
                        + " 开启了电子门");  
                /* 电子门开启状态将维持5秒后关闭 */  
                try {  
                    Thread.sleep(5000); // 让电子门开启状态维持5秒  
                } catch (InterruptedException e) {  
                    System.out.println(e.getMessage());  
                }  
                door.close(); // 关闭电子门  
                System.out.println("---电子门5秒后自动关闭---");  
            } else  
                System.out.println("验证失败");  
        }  
  
    }  
}
