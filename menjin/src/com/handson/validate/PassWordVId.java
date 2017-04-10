package com.handson.validate;

public class PassWordVId implements Validate{
	@Override  
    public boolean check(Object ob, String inputMsg) {  
        boolean ban = false;  
        String[] srContent = (String[]) ob;  
        for (int i = 0; i < srContent.length; i++) {  
            if (srContent[i].equals("")) {  
                break;  
            } else {  
                if (srContent[i].equals(inputMsg))  
                    ban = true;  
            }  
  
        }  
        return ban;  
    }  
}
