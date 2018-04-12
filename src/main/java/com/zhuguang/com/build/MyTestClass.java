package com.zhuguang.com.build;

public class MyTestClass {
    
    private String field1;
    
    private String field2;
    
    private String field3;
    
    private String field4;
    
    private String field5;
    
    public static MyTestClass builder() {
        return new MyTestClass();
    }
    
    private MyTestClass field1(String field1) {
        this.field1 = field1;
        return this;
    }
    
    private MyTestClass field2(String field2) {
        this.field2 = field2;
        return this;
    }
    
    private MyTestClass field3(String field3) {
        this.field3 = field3;
        return this;
    }
    
    private MyTestClass field4(String field4) {
        this.field4 = field4;
        return this;
    }
    
    private MyTestClass field5(String field5) {
        this.field5 = field5;
        return this;
    }
    
    public static void main(String[] args) {
        MyTestClass field52 = MyTestClass.builder()
                .field1("xx")
                .field2("xx")
                .field3("xx")
                .field4("xx")
                .field5("xx");
    }
    
}
