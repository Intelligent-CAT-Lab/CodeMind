System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1

Expected output:
w

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
        List<String> ans = new ArrayList<>();
        if (n == 1) {
            ans.add("a");
        } else {
            List<String> prev = main(n - 1);
            for (String s : prev) {
                int m = s.charAt(s.length() - 1) - 'a';
                List<String> temp = new ArrayList<>();
                for (int i = 0; i <= m; i++) {
                    temp.add(s + (char) (i + 'a'));
                }
                ans.addAll(temp);
            }
        }
        for (String s : ans) {
            System.out.println(s);
        }
    }

    public static List<String> main(int n) {
        List<String> ans = new ArrayList<>();
        if (n == 1) {
            ans.add("a");
        } else {
            List<String> prev = main(n - 1);
            for (String s : prev) {
                int m = s.charAt(s.length() - 1) - 'a';
                List<String> temp = new ArrayList<>();
                for (int i = 0; i <= m; i++) {
                    temp.add(s + (char) (i + 'a'));
                }
                ans.addAll(temp);
            }
        }
        return ans;
    }
}
```<|endoftext|>
