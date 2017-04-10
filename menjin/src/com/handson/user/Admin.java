package com.handson.user;
import java.util.Scanner;  

import com.handson.sys.Door; 
public class Admin extends Employee{
	 // ���췽��  
    public Admin() {  
        super();  
    }  
  
    public Admin(String name) {  
        super(name);  
    }  
  
    // ����Ա�Ĺ�������1��ͨ�������ҵİ�ť������������  
    public boolean work(Door door) {  
        boolean bn = false;  
        Scanner scanner = new Scanner(System.in);  
        System.out.print("����Ա(" + this.getName() + ")�����Ű�ť��[y/n]:");  
        String btn = scanner.nextLine();  
        if (btn.equalsIgnoreCase("y")) {  
            System.out.println("����Ա(" + this.getName() + ")���¿��Ű�ť");  
            bn = true;  
        } else {  
            System.out.println("---����Ա(" + this.getName() + ")�ܾ�����");  
        }  
        return bn;  
    }  
  
    // ����Ա�Ĺ�������2����������  
    public boolean work(Door door, Guest guest) {  
        boolean bn = false;  
        if (door.isBellState()) { // ������  
            bn = this.work(door);  
            door.setBellState(false);  
        }  
        return bn;  
    }  
  
}
