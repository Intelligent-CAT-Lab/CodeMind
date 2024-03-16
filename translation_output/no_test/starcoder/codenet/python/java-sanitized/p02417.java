import java.util.*;
public class p02417 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Character, Integer> map = new HashMap<>();
        while (true) {
            try {
                String s = sc.next();
                for (int i = 0; i < s.length(); i++) {
                    char c = s.charAt(i);
                    if (c >= 'a' && c <= 'z') {
                        c = (char) (c - 32);
                    }
                    if (c >= 'A' && c <= 'Z') {
                        if (map.containsKey(c)) {
                            map.put(c, map.get(c) + 1);
                        } else {
                            map.put(c, 1);
                        }
                    }
                }
            } catch (Exception e) {
                break;
            }
        }
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.print(c + " ");
            System.out.print(": ");
            if (map.containsKey(c)) {
                System.out.println(map.get(c));
            } else {
                System.out.println(0);
            }
        }
    }
}