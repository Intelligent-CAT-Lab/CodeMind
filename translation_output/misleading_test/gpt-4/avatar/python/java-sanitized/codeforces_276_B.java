import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class codeforces_276_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        char[] s = input.toCharArray();
        boolean canBePalindrome = true;
        Map<Character, Integer> dt = new HashMap<>();
        
        for (char c : s) {
            dt.put(c, dt.getOrDefault(c, 0) + 1);
        }
        
        int cnt = 0;
        for (int value : dt.values()) {
            if (value % 2 != 0) {
                if (cnt < 1) {
                    cnt++;
                } else {
                    canBePalindrome = false;
                    break;
                }
            }
        }
        
        if (canBePalindrome) {
            System.out.println("First");
        } else if (!canBePalindrome && s.length % 2 == 0) {
            System.out.println("Second");
        } else if (!canBePalindrome && s.length % 2 != 0) {
            System.out.println("First");
        }
        
        sc.close();
    }
}