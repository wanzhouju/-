package com.handson.sys;

public class Door {
	public final static String OPEN = "门已开启";  
    public final static String CLOSE = "门已关闭";  
    private String state = CLOSE; // 电子门状态  
    private boolean bellState = false; // 门铃状态  
  
    // 构造方法  
    public Door() {  
        this.setState(CLOSE);  
    }  
  
    // 开启电子门  
    public void open() {  
        this.setState(OPEN);  
    }  
  
    // 关闭电子门  
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
