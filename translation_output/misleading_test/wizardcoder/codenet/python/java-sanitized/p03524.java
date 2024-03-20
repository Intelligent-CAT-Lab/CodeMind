import java.util.*;

public class p03524 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();

        Map<Character, Integer> s_frq_dict = new HashMap<>();
        for (int i = 0; i < S.length(); i++) {
            char s = S.charAt(i);
            s_frq_dict.put(s, s_frq_dict.getOrDefault(s, 0) + 1);
        }

        List<Integer> frqs = new ArrayList<>(s_frq_dict.values());
        if (frqs.get(frqs.size() - 1) - frqs.get(0) <= 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}