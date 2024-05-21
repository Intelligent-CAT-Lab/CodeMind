import java.util.*;

public class p02417 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Character> A = new ArrayList<>();
        while (sc.hasNext()) {
            String S = sc.next();
            for (char s : S.toCharArray()) {
                if (Character.isLetter(s)) {
                    A.add(Character.toLowerCase(s));
                }
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
        for (char i = 'a'; i <= 'z'; i++) {
            System.out.print((char) i + " : ");
            if (D.containsKey(i)) {
                System.out.println(D.get(i));
            } else {
                System.out.println(0);
            }
        }
    }
}