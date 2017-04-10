package com.handson.validate;
import java.util.HashMap; 
public class CardVId implements Validate{
	 public boolean check(Object ob, String inputMsg) {  
	        boolean ban = false;  
	        HashMap srContent = (HashMap) ob;  
	        for (int i = 0; i < srContent.size(); i++) {  
	            if (srContent.get(i).equals(inputMsg)) {  
	                ban = true;  
	                break;  
	            }  
	        }  
	        return ban;  
	    }  
	  
}
