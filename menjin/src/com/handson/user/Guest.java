package com.handson.user;
import java.util.Scanner;  

import com.handson.sys.Door;  
public class Guest {
	private String name; // ����  
	  
    // ���췽��  
    public Guest() {  
    }  
  
    public Guest(String name) {  
        this.name = name;  
    }  
  
    // �ÿͰ�����  
    public void pressRing(Door door) {  
        Scanner scanner = new Scanner(System.in);  
        System.out.print("�ÿ�(" + this.getName() + ")�����壿[y/n]:");  
        String btn = scanner.nextLine();  
        if (btn.equals("y")) {  
            door.setBellState(true); // ��������  
            System.out.println("�ÿ�(" + this.getName() + ")��������");  
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
