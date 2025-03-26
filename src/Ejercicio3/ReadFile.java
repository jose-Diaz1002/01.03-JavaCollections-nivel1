package Ejercicio3;

import java.io.*;

public class ReadFile {
    public void read (){
        try {
            FileReader inpu = new FileReader("C:/Users/Windows10Pro/IdeaProjects/01.03-JavaCollections-nivel1/countries.txt");
            int x = 0;
            while (x!=-1){
                x = inpu.read();
                char letter = (char)x;
                System.out.print(letter);
            }
            inpu.close();
        } catch (IOException e) {
            //throw new RuntimeException(e);
            System.out.println("file not found");
        }
    }
}
