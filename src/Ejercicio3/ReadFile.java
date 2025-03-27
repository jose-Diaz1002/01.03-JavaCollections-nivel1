package Ejercicio3;

import java.io.*;
import java.nio.file.Paths;
import java.util.HashMap;

public class ReadFile {
    public void read() {
        HashMap<String, String> dataMap = new HashMap<>();
        try {
            String path = Paths.get("src", "Files", "txt", "countries.txt").toString();
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
        System.out.println("el contenido de del map");
        for (String key : dataMap.keySet()) {

            System.out.println(key + ":  " + dataMap.get(key));

        }

    }
}
