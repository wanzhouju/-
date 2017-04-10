package com.handson.user;
import java.util.Scanner;  

import com.handson.sys.Door;  
public class Guest {
	private String name; // 姓名  
	  
    // 构造方法  
    public Guest() {  
    }  
  
    public Guest(String name) {  
        this.name = name;  
    }  
  
    // 访客按门铃  
    public void pressRing(Door door) {  
        Scanner scanner = new Scanner(System.in);  
        System.out.print("访客(" + this.getName() + ")按门铃？[y/n]:");  
        String btn = scanner.nextLine();  
        if (btn.equals("y")) {  
            door.setBellState(true); // 门铃响起  
            System.out.println("访客(" + this.getName() + ")按下门铃");  
        } else if (btn.equals("n")) {  
            return;  
        }  
    }  
  
    public String getName() {  
        return name;  
    }  
  
    public void setName(String name) {  
        this.name = name;  
    }  
}
