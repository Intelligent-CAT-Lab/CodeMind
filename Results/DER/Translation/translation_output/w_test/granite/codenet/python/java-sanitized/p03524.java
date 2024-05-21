import java.util.*;

public class p03524 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        Map<Character, Integer> sFrqDict = new HashMap<>();
        for (char s : S.toCharArray()) {
            sFrqDict.put(s, sFrqDict.getOrDefault(s, 0) + 1);
        }
        List<Integer> frqs = new ArrayList<>(sFrqDict.values());
        Collections.sort(frqs);
        if (frqs.get(frqs.size() - 1) - frqs.get(0) <= 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}