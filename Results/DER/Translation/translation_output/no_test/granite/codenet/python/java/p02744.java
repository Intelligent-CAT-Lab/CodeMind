System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
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


Answer:
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
            List<String> prev = main(n - 1);
            for (String s : prev) {
                List<String> next = f(s);
                ans.addAll(next);
            }
            return ans;
        }
    }

    public static List<String> f(String s) {
        int m = s.chars().max().getAsInt() - 'a';
        List<String> res = new ArrayList<>();
        for (int i = 0; i <= m + 1; i++) {
            res.add(s);
        }
        for (int i = 0; i <= m + 1; i++) {
            res.set(i, res.get(i) + (char) (i + 'a'));
        }
        return res;
    }
}
```<|endoftext|>
