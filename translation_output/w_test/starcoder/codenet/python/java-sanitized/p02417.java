import java.util.*;
public class p02417 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
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
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.print(c + " : ");
            if (map.containsKey(c)) {
                System.out.println(map.get(c));
            } else {
                System.out.println(0);
            }
        }
    }
}