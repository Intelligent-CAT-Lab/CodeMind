import java.util.HashMap;
import java.util.Map;

public class p03524 {
    public static void main(String[] args) {
        String S = "abac";
        Map<Character, Integer> s_frq_dict = new HashMap<>();
        s_frq_dict.put('a', 0);
        s_frq_dict.put('b', 0);
        s_frq_dict.put('c', 0);

        for (char s : S.toCharArray()) {
            s_frq_dict.put(s, s_frq_dict.get(s) + 1);
        }

        int[] frqs = new int[3];
        int i = 0;
        for (int freq : s_frq_dict.values()) {
            frqs[i++] = freq;
        }

        if (Math.max(frqs[0], Math.max(frqs[1], frqs[2])) - Math.min(frqs[0], Math.min(frqs[1], frqs[2])) <= 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}