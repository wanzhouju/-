package com.handson.sys;

public class Door {
	public final static String OPEN = "���ѿ���";  
    public final static String CLOSE = "���ѹر�";  
    private String state = CLOSE; // ������״̬  
    private boolean bellState = false; // ����״̬  
  
    // ���췽��  
    public Door() {  
        this.setState(CLOSE);  
    }  
  
    // ����������  
    public void open() {  
        this.setState(OPEN);  
    }  
  
    // �رյ�����  
    public void close() {  
        this.setState(CLOSE);  
    }  
  
    // setter/getter  
    public String getState() {  
        return state;  
    }  
  
    public void setState(String state) {  
        this.state = state;  
    }  
  
    public boolean isBellState() {  
        return bellState;  
    }  
  
    public void setBellState(boolean bellState) {  
        this.bellState = bellState;  
    }  
}
