package com.handson.test;
import java.util.Scanner;  

import com.handson.sys.Computer;  
import com.handson.sys.Door;  
import com.handson.user.Admin;  
import com.handson.user.Guest; 
public class Test {
	public static void main(String[] args) {  
		  
        System.out.println("�Ž�ϵͳ��ʹ�÷���\n" + " 1.ģ���������룺�ԡ�pa����ͷ���������\n"  
                + " 2.ģ��ˢ�����ԡ�ca����ͷ���������\n" + " 3.ģ��ȡָ�ƣ��ԡ�fi����ͷ�������ʾָ�Ƶ��ַ���\n"  
                + " 4.ģ�����Ա���¿��Ű�ť�����롰y��");  
        System.out  
                .println("***************************************************");  
        System.out.println("�Ž�ϵͳ����");  
  
        System.out.println("�Ž�ϵͳ---�ÿͲ���");  
        System.out  
                .println("***************************************************");  
  
        Scanner in = new Scanner(System.in);  
        Door door = new Door();  
        boolean ban = true;  
        boolean bn = false;  
        Computer coputer = new Computer();  
        Admin admin = new Admin("��ʯͷ");  
        while (ban) {  
            System.out.println("��ѡ����ݵĽ�ɫ��1.����  2.����Ա 3.Ա��  ����������");  
            String n = in.next();  
            switch (Integer.parseInt(n)) {  
            case 1:  
                Guest guest = new Guest("��ǿ");  
                guest.pressRing(door); // ������  
                bn = admin.work(door, guest); // ����Ա��������  
                /* ��鿪���ź�(�������壬��) */  
                break;  
            case 2:  
            case 3:  
                System.out.println("��������֤��Ϣ��");  
                bn = coputer.validate(in.next());  
                break;  
            default:  
                ban = false;  
            }  
            if (bn) {  
                door.open(); // ����������  
                System.out.println("-------^_^����Ա " + admin.getName()  
                        + " �����˵�����");  
                /* �����ſ���״̬��ά��5���ر� */  
                try {  
                    Thread.sleep(5000); // �õ����ſ���״̬ά��5��  
                } catch (InterruptedException e) {  
                    System.out.println(e.getMessage());  
                }  
                door.close(); // �رյ�����  
                System.out.println("---������5����Զ��ر�---");  
            } else  
                System.out.println("��֤ʧ��");  
        }  
  
    }  
}
