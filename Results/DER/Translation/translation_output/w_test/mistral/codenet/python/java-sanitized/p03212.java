import java.util.*;

public class p03212 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = dfs("0");
        System.out.println(result);
    }

    public static int dfs(String s) {
        if (s.length() > n) {
            return 0;
        }
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == '7' || c == '5' || c == '3') {
                count++;
            }
        }
        if (count == 3) {
            return 1;
        }
        for (char c : "753".toCharArray()) {
            result += dfs(s + c);
        }
        return result;
    }
}