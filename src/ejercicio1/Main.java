package ejercicio1;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<Month> months = new ArrayList<>();

        months.add(new Month("January"));
        months.add(new Month("February"));
        months.add(new Month("March"));
        months.add(new Month("April"));
        months.add(new Month("May"));
        months.add(new Month("June"));
        months.add(new Month("July"));
        months.add(new Month("September"));
        months.add(new Month("October"));
        months.add(new Month("November"));
        months.add(new Month("December"));

        for (Month month : months) {
            System.out.println(month.getName());
        }
        System.out.println("--------------------------------------------");

        ListIterator<Month> iterator = months.listIterator();

        while (iterator.hasNext()) {
            if (iterator.next().getName().equals("July")) {
                iterator.add(new Month("August"));
            }
        }

        for (Month month : months) {
            System.out.println(month.getName());
        }

        HashSet<Month> lists = new HashSet<Month>();
        lists.addAll(months);
        System.out.println("----------------------------------------------");
        for (Month list : lists) {
            System.out.println(list.getName());
        }
        System.out.println("----------------------------------------------");
    }
}





















