import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class p03624 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        char[] s = input.toCharArray();
        Set<Character> s2 = new HashSet<>();
        for (char c : s) {
            s2.add(c);
        }
        Character[] s3 = s2.toArray(new Character[0]);
        Arrays.sort(s3);
        char[] s4 = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        boolean found = false;
        for (int i = 0; i < s3.length; i++) {
            if (s3[i] != s4[i]) {
                System.out.println(s4[i]);
                found = true;
                break;
            }
        }
        if (!found && s3.length < s4.length) {
            System.out.println(s4[s3.length]);
        } else if (!found) {
            System.out.println("None");
        }
        scanner.close();
    }
}