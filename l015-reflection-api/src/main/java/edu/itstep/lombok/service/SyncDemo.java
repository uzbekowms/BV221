package edu.itstep.lombok.service;

import lombok.Synchronized;

public class SyncDemo {

    private final Object readLock = new Object();

    @Synchronized
    public static void sayHello() {
        System.out.println("Hello");
    }

    @Synchronized
    public int getOne() {
        return 1;
    }

    @Synchronized("readLock")
    public void printObject() {
        System.out.println(readLock);
    }
}
