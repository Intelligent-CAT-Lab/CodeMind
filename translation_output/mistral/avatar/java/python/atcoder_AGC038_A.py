<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class atcoder_AGC038_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                int x;
                if (j < a ^ i < b) {
                    x = 1;
                } else {
                    x = 0;
                }
                sb.append(x);
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
```
[/INST]
```python
import sys

def main():
    h, w, a, b = map(int, input().split())
    sb = ""
    for i in range(h):
        for j in range(w):
            x = 1 if j < a ^ i < b else 0
            sb += str(x)
        sb += "\n"
    print(sb)

if __name__ == "__main__":
    main()
```</s>
