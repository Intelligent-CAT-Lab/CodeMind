import java.util.*;

public class p02417 {
    public static void main(String[] args) {
        List<Character> A = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                String S = scanner.nextLine();
                for (char s : S.toCharArray()) {
                    if ((s >= 'a' && s <= 'z') || (s >= 'A' && s <= 'Z')) {
                        A.add(Character.toLowerCase(s));
                    }
                }
            } catch (Exception e) {
                break;
            }
        }

        Map<Character, Integer> D = new HashMap<>();
        for (char s : A) {
            D.put(s, D.getOrDefault(s, 0) + 1);
        }

        for (char i = 'a'; i <= 'z'; i++) {
            System.out.print(i + " : ");
            if (D.containsKey(i)) {
                System.out.println(D.get(i));
            } else {
                System.out.println(0);
            }
        }
    }
}