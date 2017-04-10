package com.handson.user;
import java.util.Scanner;  

import com.handson.sys.Door;
public class Employee extends Guest{
	//构造方法  
    public Employee() {  
        super();  
    }  
    public Employee(String name) {  
        super(name);  
    }    
    //输入身份信息  
    public String input() {  
        Scanner scanner = new Scanner(System.in);  
        System.out.print("身份验证：" );  
        String passStr = scanner.nextLine();  
        return passStr;  
    }  
}
