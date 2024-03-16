import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class p04019 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Set<Character> uniqueChars = new HashSet<>();

        for (char c : input.toCharArray()) {
            uniqueChars.add(c);
        }

        int uniqueSize = uniqueChars.size();

        if (uniqueSize == 4) {
            System.out.println("Yes");
        } else if (uniqueSize == 3) {
            System.out.println("No");
        } else if (uniqueSize == 2) {
            if (uniqueChars.contains('N') && uniqueChars.contains('S')) {
                System.out.println("Yes");
            } else if (uniqueChars.contains('E') && uniqueChars.contains('W')) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } else {
            System.out.println("No");
        }

        scanner.close();
    }
}