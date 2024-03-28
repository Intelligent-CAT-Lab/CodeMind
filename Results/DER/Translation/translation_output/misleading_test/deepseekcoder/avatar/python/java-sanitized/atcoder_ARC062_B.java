import java.util.*;

public class atcoder_ARC062_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        Map<Character, Integer> counter = new HashMap<>();
        for (char c : S.toCharArray()) {
            counter.put(c, counter.getOrDefault(c, 0) + 1);
        }
        System.out.println((counter.getOrDefault('g', 0) - counter.getOrDefault('p', 0)) / 2);
    }
}