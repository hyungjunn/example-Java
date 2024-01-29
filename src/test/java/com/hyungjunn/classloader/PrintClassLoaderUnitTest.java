package com.hyungjunn.classloader;

import org.junit.jupiter.api.Test;

class PrintClassLoaderUnitTest {

    @Test
    void test() throws Exception {
        PrintClassLoader sampleClassLoader = (PrintClassLoader) Class.forName(PrintClassLoader.class.getName()).getConstructor().newInstance();
        sampleClassLoader.printClassLoaders();
        Class.forName(PrintClassLoader.class.getName(), true, PrintClassLoader.class.getClassLoader().getParent());
    }

}