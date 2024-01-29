package com.hyungjunn.classloader;

import java.sql.DriverManager;
import java.util.ArrayList;

public class PrintClassLoader {

    public void printClassLoaders() throws ClassNotFoundException {

        System.out.println("PrintClassLoader.class.getClassLoader() = " + PrintClassLoader.class.getClassLoader());
        System.out.println("DriverManager.class.getClassLoader() = " + DriverManager.class.getClassLoader());
        System.out.println("ArrayList.class.getClassLoader() = " + ArrayList.class.getClassLoader());
    }

}
