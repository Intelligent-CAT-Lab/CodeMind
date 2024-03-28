<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
n = int(input())

def dfs(s):
    if int(s) > n:
        return 0
    ret = 1 if all(s.count(c) > 0 for c in '753') else 0
    for c in '753':
        ret += dfs(s + c)
    return ret

print(dfs('0'))
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int result = dfs("0");
        System.out.println(result);
    }

    public static int dfs(String s) {
        if (s.length() > n) {
            return 0;
        }
        int ret = 1;
        for (char c : '753'.toCharArray()) {
            ret += dfs(s + c);
        }
        return ret;
    }
}
```</s>
