package ejercicio3;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ReadFile accessing = new ReadFile();
        Random random = new Random();
        String name;
        int counter = 0;
        Map<String, String> paises = accessing.readText();

        System.out.println("Enter your name: ");
        name = scanner.nextLine();
        List<String> countries = new ArrayList<>(paises.keySet());

        for (int i = 1; i <= 10; i++) {

            String randomCountry = countries.get(random.nextInt(countries.size()));
            System.out.println("What is the capital of " + randomCountry + ": ");
            String country = scanner.nextLine().trim();
            if (country.equalsIgnoreCase(paises.get(randomCountry))) {
                System.out.println("Very good");
                counter++;

            } else {
                System.out.println("Incorrect. The correct answer is: " + paises.get(randomCountry));
            }
        }
        System.out.println("\n" + name + ". your final score is: " + counter + "/10");

        accessing.WriteFile(name, counter);


    }
}
