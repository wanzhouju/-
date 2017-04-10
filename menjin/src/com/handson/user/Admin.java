package com.handson.user;
import java.util.Scanner;  

import com.handson.sys.Door; 
public class Admin extends Employee{
	 // 构造方法  
    public Admin() {  
        super();  
    }  
  
    public Admin(String name) {  
        super(name);  
    }  
  
    // 管理员的工作方法1，通过控制室的按钮，开启电子门  
    public boolean work(Door door) {  
        boolean bn = false;  
        Scanner scanner = new Scanner(System.in);  
        System.out.print("管理员(" + this.getName() + ")按开门按钮？[y/n]:");  
        String btn = scanner.nextLine();  
        if (btn.equalsIgnoreCase("y")) {  
            System.out.println("管理员(" + this.getName() + ")按下开门按钮");  
            bn = true;  
        } else {  
            System.out.println("---管理员(" + this.getName() + ")拒绝开门");  
        }  
        return bn;  
    }  
  
    // 管理员的工作方法2，监听门铃  
    public boolean work(Door door, Guest guest) {  
        boolean bn = false;  
        if (door.isBellState()) { // 门铃响  
            bn = this.work(door);  
            door.setBellState(false);  
        }  
        return bn;  
    }  
  
}
