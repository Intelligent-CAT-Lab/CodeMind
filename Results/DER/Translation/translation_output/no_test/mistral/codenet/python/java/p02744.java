<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
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
[/INST]
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> ans = main(n);
        for (String s : ans) {
            System.out.println(s);
        }
    }

    public static List<String> main(int n) {
        if (n == 1) {
            return Arrays.asList("a");
        } else {
            List<String> ans = new ArrayList<>();
            for (String s : main(n - 1)) {
                ans.addAll(f(s));
            }
            return ans;
        }
    }

    public static List<String> f(String s) {
        int m = (int) s.charAt(0) - 'a';
        List<String> res = new ArrayList<>();
        for (int i = 0; i <= m + 1; i++) {
            res.add(String.valueOf((char) (i + 'a')));
        }
        return res;
    }
}
```</s>
