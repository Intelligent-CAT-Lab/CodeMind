

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String src = sc.nextLine();
        List<Character> tokens = new ArrayList<>();
        for (char c : src.toCharArray()) {
            if (c != ' ') {
                tokens.add(c);
            }
        }
        tokens.add(' ');
        int cur = 0;
        int[] ans = parse_formula(tokens, cur);
        System.out.println(ans[0] + " " + ans[1]);
    }

    public static int[] parse_formula(List<Character> tokens, int cur) {
        return parse_or(tokens, cur);
    }

    public static int[] parse_or(List<Character> tokens, int cur) {
        int[] lhs = parse_and(tokens, cur);
        if (tokens.get(cur) == '|') {
            cur++;
            int[] rhs = parse_or(tokens, cur);
            int zero = lhs[0] + rhs[0];
            int one = Math.min(lhs[1], lhs[0] + rhs[1]);
            return new int[]{zero, one};
        }
        return lhs;
    }

    public static int[] parse_and(List<Character> tokens, int cur) {
        int[] lhs = parse_term(tokens, cur);
        if (tokens.get(cur) == '&') {
            cur++;
            int[] rhs = parse_and(tokens, cur);
            int zero = Math.min(lhs[0], lhs[1] + rhs[0]);
            int one = lhs[1] + rhs[1];
            return new int[]{zero, one};
        }
        return lhs;
    }

    public static int[] parse_term(List<Character> tokens, int cur) {
        if (tokens.get(cur) == '?') {
            cur++;
            return new int[]{1, 1};
        } else if (tokens.get(cur) == '(') {
            cur++;
            int[] res = parse_or(tokens, cur);
            if (tokens.get(cur) != ')') {
                throw new RuntimeException("not closed");
            }
            cur++;
            return res;
        }
        return null;
    }
}
```

## 2.

Write a program to calculate the number of ways to decode a given string.

A message containing letters from A-Z is being encoded to numbers using the following mapping:

```
'A' -> 1
'B' -> 2
...
'Z' -> 26
```

Given an encoded message containing digits, determine the total number of ways to decode it.

For example,

Given encoded message "12", it could be decoded as "AB" (1 2) or "L" (12).

The number of ways decoding "12" is 2.

```java
public class Solution {
    public int numDecodings(String s) {
        if (s.length() == 0) {
            return 0;
        }
        int[] dp = new int[s.length() + 1];
        dp[0] = 1;
        dp[1] = s.charAt(0) == '0' ? 0 : 1;
        for (int i = 2; i <= s.length(); i++) {
            int one = Integer.valueOf(s.substring(i - 1, i));
            if (one != 0) {
                dp[i] += dp[i - 1];
            }
            if (s.charAt(i - 2) == '0') {
                continue;
            }
            int two = Integer.valueOf(s.substring(i - 2, i));
            if (two <= 26) {
                dp[i] += dp[i - 2];
            }
        }
        return dp[s.length()];
    }
}
```

## 3.

Given a string s, partition s such that every substring of the partition is a palindrome.

Return all possible palindrome partitioning of s.

For example, given s = "aab",
Return

```
[
  ["aa","b"],
  ["a","a","b"]
]
```

```java
public class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> cur = new ArrayList<>();
        dfs(s, 0, cur, res);
        return res;
    }

    public void dfs(String s, int start, List<String> cur, List<List<String>> res) {
        if (start == s.length()) {
            res.add(new ArrayList<>(cur));
            return;
        }
        for (int i = start; i < s.length(); i++) {
            if (isPalindrome(s, start, i)) {
                cur.add(s.substring(start, i + 1));
                dfs(s, i + 1, cur, res);
                cur.remove(cur.size() - 1);
            }
        }
    }

    public boolean isPalindrome(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
```

## 4.

Given a string s, partition s such that every substring of the partition is a palindrome.

Return the minimum cuts needed for a palindrome partitioning of s.

For example, given s = "aab",
Return 1 since the palindrome partitioning ["aa","b"] could be produced using 1 cut.

```java
public class Solution {
    public int minCut(String s) {
        int[] dp = new int[s.length() + 1];
        for (int i = 0; i <= s.length(); i++) {
            dp[i] = i - 1;
        }
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; i - j >= 0 && i + j < s.length() && s.charAt(i - j) == s.charAt(i + j); j++) {
                dp[i + j + 1] = Math.min(dp[i + j + 1], dp[i - j] + 1);
            }
            for (int j = 1; i - j + 1 >= 0 && i + j < s.length() && s.charAt(i - j + 1) == s.charAt(i + j); j++) {
                dp[i + j + 1] = Math.min(dp[i + j + 1], dp[i - j + 1] + 1
