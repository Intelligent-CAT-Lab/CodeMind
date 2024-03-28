import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class p04019 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        scanner.close();

        Set<Character> uniqueDirections = new HashSet<>();
        for (char ch : input.toCharArray()) {
            uniqueDirections.add(ch);
        }

        if (uniqueDirections.size() == 4) {
            System.out.println("Yes");
        } else if (uniqueDirections.size() == 3) {
            System.out.println("No");
        } else if (uniqueDirections.size() == 2) {
            if (uniqueDirections.contains('N') && uniqueDirections.contains('S')) {
                System.out.println("Yes");
            } else if (uniqueDirections.contains('E') && uniqueDirections.contains('W')) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } else {
            System.out.println("No");
        }
    }
}