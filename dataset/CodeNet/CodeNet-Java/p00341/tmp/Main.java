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
            e.add(sc.nextInt());
System.out.println("[INST]12;None;e.add(sc.nextInt());"+e.add(sc.nextInt()));
System.out.println("[INST]12;None;sc.nextInt();"+sc.nextInt());
        }

        if(e.stream().distinct().count() > 3) {
System.out.println("[INST]15;None;e.stream().distinct().count();"+e.stream().distinct().count());
System.out.println("[INST]15;None;e.stream().distinct();"+e.stream().distinct());
System.out.println("[INST]15;None;e.stream();"+e.stream());
            System.out.println("no");
            return;
        }
        Collections.sort(e);
System.out.println("[INST]19;None;Collections.sort(e);"+Collections.sort(e));
        disinct = e.stream().distinct().toArray();
System.out.println("[INST]20;disinct;e.stream().distinct().toArray();"+disinct);
System.out.println("[INST]20;None;e.stream().distinct();"+e.stream().distinct());
System.out.println("[INST]20;None;e.stream();"+e.stream());
        for(Object a : disinct) {
            each = e.stream().filter(i -> i == a).count();
System.out.println("[INST]22;each;e.stream().filter(i -> i == a).count();"+each);
System.out.println("[INST]22;None;e.stream().filter(i -> i == a);"+e.stream().filter(i -> i == a));
System.out.println("[INST]22;None;e.stream();"+e.stream());
            if(each != 4 && each != 8 && each != 12) {
                System.out.println("no");
                return;
            }
        }
        System.out.println("yes");
    }
}