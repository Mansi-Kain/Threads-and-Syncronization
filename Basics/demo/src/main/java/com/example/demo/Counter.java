package com.example.demo;

public class Counter {
    private int count=0;

    //only one thread can run it at a time
    // method sync
    public synchronized void increment(){
        count++;
    }

//    OR
    //block sync
//    public  void increment(){
//        synchronized (this){
//            count++;
//        }
//    }

//Intrinsic Lock:No control who will execute first
// Explicit Lock:control over execution
    public int getCount(){
        return count;
    }
}
