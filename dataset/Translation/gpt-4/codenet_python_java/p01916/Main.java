import java.util.HashMap;
import java.util.Scanner;

public class p01916 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Character, Integer> dic = new HashMap<>();
        String input = scanner.next();
        char[] S = input.toCharArray();

        for (char s : S) {
            dic.put(s, dic.getOrDefault(s, 0) + 1);
        }

        int ans = 0;
        for (int count : dic.values()) {
            if ((count & 1) == 1) {
                ans++;
            }
        }

        System.out.println(ans >> 1);
        scanner.close();
    }
}