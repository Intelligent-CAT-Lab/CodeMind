import java.util.HashMap;
import java.util.Map;
import java.util.Collection;
import java.util.Scanner;

public class p03524 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();

        Map<Character, Integer> s_frq_dict = new HashMap<>();
        for (char c : S.toCharArray()) {
            s_frq_dict.put(c, s_frq_dict.getOrDefault(c, 0) + 1);
        }

        Collection<Integer> frqs = s_frq_dict.values();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int frq : frqs) {
            if (frq > max) max = frq;
            if (frq < min) min = frq;
        }

        if ((max - min) <= 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}