import java.util.*;

public class p02417 {
    public static void main(String[] args) {
        List<Character> A = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String S = scanner.nextLine();
            for (char s : S.toCharArray()) {
                if ((s >= 'a' && s <= 'z') || (s >= 'A' && s <= 'Z')) {
                    A.add(Character.toLowerCase(s));
                }
            }
        }

        Map<Character, Integer> D = new HashMap<>();
        for (char s : A) {
            D.put(s, D.getOrDefault(s, 0) + 1);
        }

        for (char s = 'a'; s <= 'z'; s++) {
            System.out.print(s + " : ");
            if (D.containsKey(s)) {
                System.out.println(D.get(s));
            } else {
                System.out.println(0);
            }
        }
    }
}