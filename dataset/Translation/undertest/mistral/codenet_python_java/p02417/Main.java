import java.util.*;

public class p02417 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Character> A = new ArrayList<>();
        while (true) {
            String S = sc.nextLine();
            for (char s : S.toCharArray()) {
                if ('a' <= s <= 'z' || 'A' <= s <= 'Z') {
                    A.add(s.toLowerCase());
                }
            }
            break;
        }

        Map<Character, Integer> D = new HashMap<>();
        for (char s : A) {
            if (D.containsKey(s)) {
                D.put(s, D.get(s) + 1);
            } else {
                D.put(s, 1);
            }
        }

        List<Character> Str = new ArrayList<>();
        for (int i = 97; i < 97 + 26; i++) {
            Str.add((char) i);
        }
        for (char s : Str) {
            System.out.print(s + " : ");
            if (D.containsKey(s)) {
                System.out.print(D.get(s));
            } else {
                System.out.print(0);
            }
            System.out.println();
        }
    }
}