import java.util.*;

public class atcoder_ARC062_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        Map<Character, Integer> c = new HashMap<>();
        for (char ch : S.toCharArray()) {
            c.put(ch, c.getOrDefault(ch, 0) + 1);
        }
        int diff = Math.abs(c.getOrDefault('g', 0) - c.getOrDefault('p', 0));
        System.out.println(diff / 2);
    }
}