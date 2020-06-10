package com.kodilla.exception.io;

import java.io.File;

public class FileReaderWithoutHandling {

        public void readFile(){
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("file/names.txt").getFile());

            System.out.println(file.getPath());
        }
}

