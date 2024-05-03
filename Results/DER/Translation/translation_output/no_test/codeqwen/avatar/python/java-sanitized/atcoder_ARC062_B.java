import java.util.*;
import java.io.*;

public class atcoder_ARC062_B {
    public static void main(String[] args) {
        resolve();
    }

    public static void resolve() {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine().trim();
        Map<Character, Integer> c = new HashMap<>();
        for (char ch : S.toCharArray()) {
            c.put(ch, c.getOrDefault(ch, 0) + 1);
        }
        System.out.println((c.get('g') - c.get('p')) / 2);
    }
}