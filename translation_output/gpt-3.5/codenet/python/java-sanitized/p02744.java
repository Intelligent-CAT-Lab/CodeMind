import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class p02744 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<String> ans = main(n);
        for(String i : ans) {
            System.out.println(i);
        }
        scanner.close();
    }
    
    public static List<String> main(int n) {
        if (n == 1) {
            List<String> result = new ArrayList<>();
            result.add("a");
            return result;
        } else {
            List<String> ans = new ArrayList<>();
            for (String k : main(n-1)) {
                ans.addAll(f(k));
            }
            return ans;
        }
    }
    
    public static List<String> f(String s) {
        int m = (int) s.chars().max().getAsInt() - 97;
        List<String> res = new ArrayList<>();
        for (int i = 0; i < m+2; i++) {
            res.add(s + Character.toString((char)(i+97)));
        }
        return res;
    }
}