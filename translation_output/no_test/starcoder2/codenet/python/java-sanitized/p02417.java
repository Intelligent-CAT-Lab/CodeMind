import java.util.Scanner;
import java.util.HashMap;

public class p02417 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Character, Integer> map = new HashMap<>();
        while (sc.hasNext()) {
            String s = sc.nextLine();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
                    c = Character.toLowerCase(c);
                    if (map.containsKey(c)) {
                        map.put(c, map.get(c) + 1);
                    } else {
                        map.put(c, 1);
                    }
                }
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

/2019-09-16/README.md
# 2019-09-16