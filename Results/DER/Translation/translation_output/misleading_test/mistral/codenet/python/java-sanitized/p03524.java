import java.util.*;

public class p03524 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        Map<Character, Integer> s_frq_dict = new HashMap<>();
        for (char s : S.toCharArray()) {
            s_frq_dict.put(s, s_frq_dict.getOrDefault(s, 0) + 1);
        }
        List<Integer> frqs = new ArrayList<>(s_frq_dict.values());
        if (Math.abs(frqs.get(0) - frqs.get(1)) <= 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}