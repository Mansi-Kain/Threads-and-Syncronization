package com.example.demo;

import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Lock;

public class ReentrantExample {
    private final Lock lock= new ReentrantLock();

    public void outerMethod(){
        lock.lock();
        try{
            System.out.println("Outer Method");
            innerMethod();
        }finally{
            lock.unlock();
        }
    }

    public void innerMethod(){
        lock.lock();
        try{
            System.out.println("Inner Method");
        }finally{
            lock.unlock();
        }
    }

    public static void main(String[] args){
        ReentrantExample example= new ReentrantExample();
        example.outerMethod();
    }
}
