import java.util.HashMap;
import java.util.Scanner;

public class p01916 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        
        HashMap<Character, Integer> dic = new HashMap<>();
        for (char c : input.toCharArray()) {
            if (!dic.containsKey(c)) {
                dic.put(c, 1);
            } else {
                dic.put(c, dic.get(c) + 1);
            }
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