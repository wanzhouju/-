package com.handson.sys;
import java.util.ArrayList;  
import java.util.HashMap;  
import java.util.Scanner;  
  
import com.handson.validate.CardVId;  
import com.handson.validate.FingVId;  
import com.handson.validate.PassWordVId;  
import com.handson.validate.Validate;  
public class Computer {
	HashMap Card = new HashMap();  
    ArrayList Fing = new ArrayList();  
    String[] Pass = new String[10];  
  
    public Computer() {  
        Card.put(0, "car000");  
        Card.put(1, "car001");  
        Card.put(2, "car002");  
  
        Fing.add("fing000");  
        Fing.add("fing001");  
        Fing.add("fing002");  
  
        Pass[0] = "pas000";  
        Pass[1] = "pas001";  
        Pass[2] = "pas002";  
        Pass[3] = "";  
    }  
  
    public boolean validate(String imputMsg) {  
        boolean ban = false;  
        Scanner in = new Scanner(System.in);  
        System.out.println("��ѡ����֤��ʽ��1-���� 2-ָ�� 3-����");  
        int n = in.nextInt();  
        Validate val;  
        switch (n) {  
        case 1:  
            val = new CardVId();  
            ban = val.check(Card, imputMsg);  
            break;  
        case 2:  
            val = new FingVId();  
            ban = val.check(Fing, imputMsg);  
            break;  
        case 3:  
            val = new PassWordVId();  
            ban = val.check(Pass, imputMsg);  
            break;  
        default:  
            System.out.println("ѡ�����");  
  
        }  
        return ban;  
    }  
}
