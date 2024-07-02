
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int s = sc.nextInt();
System.out.println("[INST]10;s;sc.nextInt();"+s);
        Set<Integer> set = new HashSet<>();
        set.add(s);
System.out.println("[INST]12;None;set.add(s);"+set.add(s));
        int i = 1;
        while (true) {
            i++;
            if (s % 2 == 0) {
                s = s / 2;
            } else {
                s = 3 * s + 1;
            }
            if (set.contains(s)) {
System.out.println("[INST]21;None;set.contains(s);"+set.contains(s));
                System.out.println(i);
                return;
            } else {
                set.add(s);
System.out.println("[INST]25;None;set.add(s);"+set.add(s));
            }
        }
    }
}
