package Ejercicio3;

import java.io.*;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class ReadFile {
    public void read() {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> dataMap = new HashMap<>();
        Random random = new Random();
        String name;
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
        System.out.println("Enter your name: ");
        name = scanner.nextLine();

        List<String> countries = new ArrayList<>(dataMap.keySet());
        int counter = 0;

        for (int i = 1; i <= 10; i++) {

            String randomCountry = countries.get(random.nextInt(countries.size()));
            System.out.println("Cual es la capital de " + randomCountry + ": ");
            String country = scanner.nextLine().trim();
            if (country.equalsIgnoreCase(dataMap.get(randomCountry))) {
                System.out.println("Very good");
                counter++;
            } else {
                System.out.println("Incorrect. The correct answer is: " + dataMap.get(randomCountry));
            }
        }
        System.out.println("\n" + name + ". your final score is: " + counter + "/10");
        WriteFile(name, counter);
    }
    public void WriteFile(String name, int score) {
        String path = Paths.get("src", "Files", "txt", "classification.txt").toString();
        try {
            FileWriter writer = new FileWriter(path, true);
            BufferedWriter buffer = new BufferedWriter(writer);
            buffer.write(name + " - " + score + "/10");
            buffer.newLine();
            System.out.println("Score saved in classification.txt");
            buffer.close();
        } catch (IOException e) {
            System.out.println("Error saving score.");
        }
    }
}























