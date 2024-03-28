import java.util.Scanner;
import java.util.Arrays;
import java.util.HashSet;

public class p02910 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        HashSet<Character> odd = new HashSet<>(Arrays.asList('R', 'U', 'D'));
        HashSet<Character> even = new HashSet<>(Arrays.asList('L', 'U', 'D'));

        for (int i = 0; i < s.length(); i += 2) {
            if (!odd.contains(s.charAt(i))) {
                System.out.println("No");
                System.exit(0);
            }
        }

        for (int j = 1; j < s.length(); j += 2) {
            if (!even.contains(s.charAt(j))) {
                System.out.println("No");
                System.exit(0);
            }
        }

        System.out.println("Yes");
        scanner.close();
    }
}