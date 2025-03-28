package ejercicio1;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Month month1 = new Month("January");
        Month month2 = new Month("February");
        Month month3 = new Month("March");
        Month month4 = new Month("April");
        Month month5 = new Month("May");
        Month month6 = new Month("June");
        Month month7 = new Month("July");
        Month month8 = new Month("August");
        Month month9 = new Month("September");
        Month month10 = new Month("October");
        Month month11 = new Month("November");
        Month month12 = new Month("December");

        ArrayList<Month> months = new ArrayList<Month>();

        months.add(month1);
        months.add(month2);
        months.add(month3);
        months.add(month4);
        months.add(month5);
        months.add(month6);
        months.add(month7);
        months.add(month9);
        months.add(month10);
        months.add(month11);
        months.add(month12);

        for (Month month : months) {
            System.out.println(month.getName());
        }
        System.out.println("--------------------------------------------");

        ListIterator<Month> iterator = months.listIterator();

        while (iterator.hasNext()) {
            if (iterator.next().getName().equals("July")) {
                iterator.add(month8);
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

        Iterator<Month> iterator2 = lists.iterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next().getName());
        }


    }
}





















