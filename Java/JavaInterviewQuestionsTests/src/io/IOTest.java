package io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class IOTest {

    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("io.txt");
        writer.append("FileWriter");
        writer.close();

//        BufferedWriter bufferedWriter = new BufferedWriter(writer);
//        bufferedWriter.write("Booo");
//        bufferedWriter.flush();
//        bufferedWriter.close();
    }


}
