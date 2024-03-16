Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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

### Response:
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
                ans.addAll(f(s));
            }
        }
        for (String s : ans) {
            System.out.println(s);
        }
    }

    public static List<String> f(String s) {
        int m = s.charAt(0) - 'a';
        List<String> res = new ArrayList<>(m + 2);
        for (int i = 0; i <= m + 1; i++) {
            StringBuilder sb = new StringBuilder(s);
            sb.insert(i, (char) ('a' + i));
            res.add(sb.toString());
        }
        return res;
    }

    public static List<String> main(int n) {
        if (n == 1) {
            return Arrays.asList("a");
        } else {
            List<String> prev = main(n - 1);
            List<String> ans = new ArrayList<>();
            for (String s : prev) {
                ans.addAll(f(s));
            }
            return ans;
        }
    }
}
```<|endoftext|>
