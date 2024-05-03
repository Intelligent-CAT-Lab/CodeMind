Here is the Java version of your Python code:

```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        String s = "acpc";
        System.out.println(main(s));
    }

    public static int main(String s) {
        ArrayList<Integer>[] memo = new ArrayList[26];
        for (int i = 0; i < 26; i++) {
            memo[i] = new ArrayList<>();
        }
        for (int i = 0; i < s.length(); i++) {
            memo[s.charAt(i) - 'a'].add(i);
        }
        int[][] dp = new int[s.length() + 1][s.length() + 1];
        dp[0][s.length()] = 1;
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                int p = dp[i][j];
                if (p == 0) {
                    continue;
                }
                for (int k = 0; k < 26; k++) {
                    int x = Collections.binarySearch(memo[k], i);
                    int y = Collections.binarySearch(memo[k], j - 1);
                    if (x < 0) {
                        x = -(x + 1);
                    }
                    if (y < 0) {
                        y = -(y + 1);
                    }
                    if (x > y) {
                        continue;
                    }
                    ans += p;
                    if (x < y) {
                        int mx = memo[k].get(x);
                        int my = memo[k].get(y);
                        dp[mx + 1][my] = (dp[mx + 1][my] + p) % 1000000007;
                    }

