import java.util.*;

public class atcoder_ARC062_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (c == 'g' || c == 'G') {
                map.put('g', map.getOrDefault('g', 0) + 1);
            } else if (c == 'p' || c == 'P') {
                map.put('p', map.getOrDefault('p', 0) + 1);
            }
        }
        int count = (map.getOrDefault('g', 0) - map.getOrDefault('p', 0)) / 2;
        System.out.println(count);
    }
}