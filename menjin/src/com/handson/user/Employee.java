package com.handson.user;
import java.util.Scanner;  

import com.handson.sys.Door;
public class Employee extends Guest{
	//���췽��  
    public Employee() {  
        super();  
    }  
    public Employee(String name) {  
        super(name);  
    }    
    //���������Ϣ  
    public String input() {  
        Scanner scanner = new Scanner(System.in);  
        System.out.print("�����֤��" );  
        String passStr = scanner.nextLine();  
        return passStr;  
    }  
}
