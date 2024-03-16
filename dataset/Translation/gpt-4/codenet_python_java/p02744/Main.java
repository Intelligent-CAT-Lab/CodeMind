import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p02744 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<String> ans = generateStrings(n);
        for (String s : ans) {
            System.out.println(s);
        }
        scanner.close();
    }

    private static List<String> f(String s) {
        int m = (int)maxChar(s) - 97;
        List<String> res = new ArrayList<>();
        for (int i = 0; i < m + 2; i++) {
            res.add(s + (char)(i + 97));
        }
        return res;
    }

    private static List<String> generateStrings(int n) {
        if (n == 1) {
            List<String> baseCase = new ArrayList<>();
            baseCase.add("a");
            return baseCase;
        }
        else {
            List<String> ans = new ArrayList<>();
            for (String k : generateStrings(n - 1)) {
                ans.addAll(f(k));
            }
            return ans;
        }
    }

    private static char maxChar(String s) {
        char maxChar = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) > maxChar) {
                maxChar = s.charAt(i);
            }
        }
        return maxChar;
    }
}