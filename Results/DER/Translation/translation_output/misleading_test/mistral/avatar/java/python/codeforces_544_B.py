<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
100 10000

Expected output:
96

```
import java.util.Scanner;

public class codeforces_544_B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count = scan.nextInt();
        printIsland(n, count);
    }

    public static void printIsland(int n, int count) {
        int a = (n + 1) / 2;
        int b = n / 2;
        int max = a * a + b * b;
        if (count > max) {
            System.out.println("NO");
            return;
        }
        System.out.println("YES");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i + j) % 2 == 0 && count > 0) {
                    sb.append('L');
                    count--;
                } else {
                    sb.append('S');
                }
            }
            sb.append("\n");
        }
    }
}
```
[/INST]
```python
n, count = map(int, input().split())
printIsland(n, count)

def printIsland(n, count):
    a = (n + 1) // 2
    b = n // 2
    max = a * a + b * b
    if count > max:
        print("NO")
        return
    print("YES")
    sb = ""
    for i in range(n):
        for j in range(n):
            if (i + j) % 2 == 0 and count > 0:
                sb += "L"
                count -= 1
            else:
                sb += "S"
        sb += "\n"
    print(sb)
```</s>
