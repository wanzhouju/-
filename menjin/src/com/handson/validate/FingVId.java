package com.handson.validate;
import java.util.ArrayList;
public class FingVId implements Validate {
	public boolean check(Object ob, String inputMsg) {  
        boolean ban = false;  
        ArrayList srContent = (ArrayList) ob;  
        for (int i = 0; i < srContent.size(); i++) {  
            if (srContent.get(i).equals(inputMsg)) {  
                ban = true;  
                break;  
            }  
  
        }  
        return ban;  
    }  
}
