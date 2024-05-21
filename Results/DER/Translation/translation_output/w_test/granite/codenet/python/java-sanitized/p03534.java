import java.util.*;

public class p03534 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Map<Character, Integer> map = new HashMap<>();
        map.put('a', 0);
        map.put('b', 0);
        map.put('c', 0);
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.get(c) + 1);
        }
        int[] values = map.values().stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(values);
        if (values[2] - values[0] <= 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}