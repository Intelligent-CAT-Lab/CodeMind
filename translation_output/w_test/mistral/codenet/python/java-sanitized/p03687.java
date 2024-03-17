import java.util.*;

public class p03687 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        List<Integer> list = new ArrayList<>();
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            int count = 0;
            for (char c : s.toCharArray()) {
                if (c == entry.getKey()) {
                    count = 0;
                } else {
                    count++;
                }
            }
            list.add(Math.max(count, 1));
        }
        System.out.println(Collections.min(list));
    }
}