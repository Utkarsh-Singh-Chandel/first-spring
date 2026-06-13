package com.example.lifecyclebean;

public class LifeCycleBean {
    public LifeCycleBean(){

        System.out.println("Constructor method called ");
    }

    public void init(){
        System.out.println("init method called");
    }

    public void sayHi(){
        System.out.println("Hi i am life cycle bean ... ");
    }
    public void cleanUp(){
        System.out.println("Cleanup method called ");
    }
}
