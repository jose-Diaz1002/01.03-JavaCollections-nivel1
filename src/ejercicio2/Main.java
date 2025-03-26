package ejercicio2;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {

        List<Integer> numberList = new LinkedList<Integer>();
        for(int i = 0; i< 10; i++ ){
            numberList.add(i);
        }
        System.out.println(numberList);

        List<Integer> numberList2 = new LinkedList<Integer>();

        ListIterator<Integer> iterator = numberList.listIterator(numberList.size());

        while (iterator.hasPrevious()){
            numberList2.add(iterator.previous());
        }

        System.out.println(numberList2);




    }

}
