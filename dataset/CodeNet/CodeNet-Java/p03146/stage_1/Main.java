
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int s = sc.nextInt();
        Set<Integer> set = new HashSet<>();
var newVariable_0 = set.add(s);        int i = 1;
        while (true) {
            i++;
            if (s % 2 == 0) {
                s = s / 2;
            } else {
                s = 3 * s + 1;
            }
var newVariable_1 = set.contains(s);            if (newVariable_1) {
                System.out.println(i);
                return;
            } else {
var newVariable_2 = set.add(s);            }
        }
    }
}
