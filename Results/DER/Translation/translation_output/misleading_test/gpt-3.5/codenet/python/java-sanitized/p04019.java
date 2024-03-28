import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class p04019 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] arr = scanner.nextLine().toCharArray();
        Set<Character> set = new HashSet<>();

        for (char c : arr) {
            set.add(c);
        }

        if (set.size() == 4) {
            System.out.println("Yes");
        } else if (set.size() == 3) {
            System.out.println("No");
        } else if (set.size() == 2) {
            if (set.contains('N') && set.contains('S')) {
                System.out.println("Yes");
            } else if (set.contains('E') && set.contains('W')) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } else {
            System.out.println("No");
        }
    }
}