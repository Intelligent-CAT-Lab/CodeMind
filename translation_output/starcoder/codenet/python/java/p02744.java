<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
n=int(input())
def f(s):
    m=ord(max(list(s))) - 97
    res = [s for _ in range(m+2)]
    for i in range(m+2):
        res[i] += chr(i+97)
    return res
def main(n):
    if n==1:
        return ["a"]
    else:
        ans = []
        for k in main(n-1):
            ans.extend(f(k))
        return ans

ans = main(n)
for i in ans:
    print(i)
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] ans = new String[n];
        ans[0] = "a";
        for (int i = 1; i < n; i++) {
            String s = ans[i - 1];
            int m = s.charAt(0) - 'a';
            String[] res = new String[m + 2];
            for (int j = 0; j < m + 2; j++) {
                res[j] = s + (char) ('a' + j);
            }
            ans[i] = res[m + 1];
        }
        for (String s : ans) {
            System.out.println(s);
        }
    }
}
```
<|endoftext|>
