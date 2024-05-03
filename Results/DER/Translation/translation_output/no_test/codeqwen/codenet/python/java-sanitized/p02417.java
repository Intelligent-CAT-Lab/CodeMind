import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class p02417 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Character, Integer> D = new HashMap<>();
        while (scanner.hasNextLine()) {
            String S = scanner.nextLine();
            for (char s : S.toCharArray()) {
                if (Character.isLetter(s)) {
                    D.put(Character.toLowerCase(s), D.getOrDefault(Character.toLowerCase(s), 0) + 1);
                }
            }
        }

        char[] Str = new char[26];
        for (int i = 0; i < 26; i++) {
            Str[i] = (char) (97 + i);
        }

        for (char s : Str) {
            System.out.print(s + ": ");
            if (D.containsKey(s)) {
                System.out.println(D.get(s));
            } else {
                System.out.println(0);
            }
        }
    }
}