<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
0 0 0 1

Expected output:
-1 1 -1 0


```
import java.util.Scanner;

public class p03265 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        int a = x2 - x1;
        int b = y2 - y1;
        int x3 = x2 - b;
        int y3 = y2 + a;
        int x4 = x3 - a;
        int y4 = y3 - b;

        System.out.println(String.format("%d %d %d %d", x3, y3, x4, y4));
        sc.close();
    }

}

```
[/INST]
```python
x1, y1, x2, y2 = map(int, input().split())
a = x2 - x1
b = y2 - y1
x3 = x2 - b
y3 = y2 + a
x4 = x3 - a
y4 = y3 - b
print(f"{x3} {y3} {x4} {y4}")
```</s>
