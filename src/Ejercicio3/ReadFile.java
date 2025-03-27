package Ejercicio3;

import java.io.*;
import java.nio.file.Paths;

public class ReadFile {
    public void read (){
        char letter = 0;
        try {
            String path = Paths.get("src", "Files", "txt", "countries.txt").toString();
            FileReader inpu = new FileReader(path);
            int x = 0;
            while (x!=-1){
                x = inpu.read();
                letter = (char)x;
                System.out.print(letter);
            }
            inpu.close();
        } catch (IOException e) {
            System.out.println("file not found");
        }
    }
}
