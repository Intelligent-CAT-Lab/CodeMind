import java.util.HashMap;
import java.util.Scanner;

public class p01916 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        HashMap<Character, Integer> dic = new HashMap<>();

        for (int i = 0; i < input.length(); i++) {
            char s = input.charAt(i);
            dic.put(s, dic.getOrDefault(s, 0) + 1);
        }

        int ans = 0;
        for (char k : dic.keySet()) {
            if (dic.get(k) % 2 == 1) {
                ans++;
            }
        }
        
        System.out.println(ans >> 1);
    }
}