import java.util.*;

public class p02417 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Character> A = new ArrayList<>();
        while (true) {
            try {
                String S = sc.nextLine();
                for (char s : S.toCharArray()) {
                    if (s >= 'a' && s <= 'z' || s >= 'A' && s <= 'Z') {
                        A.add(Character.toLowerCase(s));
                    }
                }
            } catch (Exception e) {
                break;
            }
        }

        Map<Character, Integer> D = new HashMap<>();
        for (char s : A) {
            if (D.containsKey(s)) {
                D.put(s, D.get(s) + 1);
            } else {
                D.put(s, 1);
            }
        }

        String[] Str = new String[26];
        for (int i = 0; i < 26; i++) {
            Str[i] = String.valueOf((char) (i + 97));
        }

        for (String s : Str) {
            System.out.print(s + " : ");
            if (D.containsKey(s.charAt(0))) {
                System.out.println(D.get(s.charAt(0)));
            } else {
                System.out.println(0);
            }
        }
    }
}