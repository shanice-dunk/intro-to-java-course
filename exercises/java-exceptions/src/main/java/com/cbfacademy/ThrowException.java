package com.cbfacademy;

import java.io.File;
import java.io.IOException;

// Practice
public class ThrowException {
    public static void createNewFileRethrow() throws IOException{
        File file = new File(".resources/nonexistent.txt");
        file.createNewFile();
    }
}
