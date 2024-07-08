import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> e = new LinkedList<>();
        long each;
        Object[] disinct;

        for(int i = 0; i < 12; i++) {
var newVariable_0 = e.add(sc.nextInt());var newVariable_1 = sc.nextInt();            e.add(newVariable_1);
        }

var newVariable_2 = e.stream().distinct().count();var newVariable_3 = e.stream().distinct();var newVariable_4 = e.stream();        if(newVariable_4.distinct().count() > 3) {
            System.out.println("no");
            return;
        }
        Collections.sort(e);
var newVariable_5 = e.stream().distinct();var newVariable_6 = e.stream();        disinct = newVariable_6.distinct().toArray();
        for(Object a : disinct) {
var newVariable_7 = e.stream().filter(i -> i == a);var newVariable_8 = e.stream();            each = newVariable_8.filter(i -> i == a).count();
            if(each != 4 && each != 8 && each != 12) {
                System.out.println("no");
                return;
            }
        }
        System.out.println("yes");
    }
}