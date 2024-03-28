import java.util.*;

public class p02417 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Character> A = new ArrayList<>();
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
            System.out.println(D.getOrDefault(s, 0));
        }
    }
}