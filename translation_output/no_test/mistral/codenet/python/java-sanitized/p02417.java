import java.util.*;

public class p02417 {
    public static void main(String[] args) {
        List<Character> A = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a string: ");
            String S = scanner.nextLine();
            for (char c : S.toCharArray()) {
                if ('a' <= c <= 'z' || 'A' <= c <= 'Z') {
                    A.add(Character.toLowerCase(c));
                }
            }
            break;
        }

        Map<Character, Integer> D = new HashMap<>();
        for (char c : A) {
            if (D.containsKey(c)) {
                D.put(c, D.get(c) + 1);
            } else {
                D.put(c, 1);
            }
        }

        List<Character> Str = new ArrayList<>();
        for (int i = 97; i < 97 + 26; i++) {
            Str.add((char) i);
        }
        for (char c : Str) {
            System.out.print(c + " ");
            System.out.print(": ");
            if (D.containsKey(c)) {
                System.out.println(D.get(c));
            } else {
                System.out.println(0);
            }
        }
    }
}