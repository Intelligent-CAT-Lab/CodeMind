<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class codeforces_581_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        int count = 0;
        while (true) {
            if (a > 0 && b > 0) {
                count++;
                a--;
                b--;
            } else break;
        }
        int ans = a / 2 + b / 2;
        System.out.println(count + " " + ans);
    }
}
```
[/INST]
```python
import sys

def main():
    a, b = map(int, sys.stdin.readline().split())
    count = 0
    while a > 0 and b > 0:
        count += 1
        a -= 1
        b -= 1
    ans = (a + b) // 2
    print(count, ans)

if __name__ == "__main__":
    main()
```</s>
