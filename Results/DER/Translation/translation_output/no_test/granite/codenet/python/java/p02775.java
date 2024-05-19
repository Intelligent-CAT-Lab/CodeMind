System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
```
# https://atcoder.jp/contests/abc155/submissions/10175015

def main():
    n = list(map(int, input()[::-1])) + [0]
    s = 0
    res = 0
    for i, ni in enumerate(n[:-1]):
        k = ni + s
        if k < 5 or (k == 5 and int(n[i + 1]) < 5):
            res += k
            s = 0
        else:
            res += 10 - k
            s = 1
    res += s
    print(res)


if __name__ == '__main__':
    main()
```


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] n = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            n[i] = s.charAt(s.length() - 1 - i) - '0';
        }
        int[] m = new int[s.length() + 1];
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += n[i];
            if (sum >= 5) {
                m[i + 1] = 1;
                sum -= 10;
            }
        }
        if (sum >= 5) {
            m[0] = 1;
        }
        int ans = 0;
        for (int i = 0; i < m.length; i++) {
            ans = ans * 2 + m[i];
        }
        System.out.println(ans);
    }
}
```<|endoftext|>
