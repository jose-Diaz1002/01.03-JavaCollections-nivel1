package ejercicio3;

import java.io.*;
import java.nio.file.Paths;
import java.util.*;

public class ReadFile {
    public Map<String, String> readText() {
        HashMap<String, String> dataMap = new HashMap<>();
        try {
            String path = Paths.get("src", "ejercicio3", "txt", "countries.txt").toString();
            FileReader reader = new FileReader(path);
            BufferedReader mybuffer = new BufferedReader(reader);
            String line;
            while ((line = mybuffer.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length == 2) {
                    String key = parts[0].trim();
                    String value = parts[1].trim();
                    dataMap.put(key, value);
                }
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("file not found");
        }
        return dataMap;
    }

    public void WriteFile(String name, int score) {
        String path = Paths.get("src", "ejercicio3", "txt", "classification.txt").toString();
        try {
            FileWriter writer = new FileWriter(path, true);
            BufferedWriter buffer = new BufferedWriter(writer);
            buffer.write(name + " - " + score + "/10");
            buffer.newLine();
            System.out.println("\nScore saved in classification.txt");
            buffer.close();
        } catch (IOException e) {
            System.out.println("\n-----Error saving score.-----");
        }
    }
}























