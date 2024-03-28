<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5 2 7

Expected output:
bB

```
import java.util.Scanner;
public class p03623 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (Math.abs(x-a) < Math.abs(x-b)) {
            System.out.println("A");
        } else {
            System.out.println("B");
        }
    }
}
```
[/INST]
```python
x, a, b = map(int, input().split())
if abs(x-a) < abs(x-b):
    print("A")
else:
    print("B")
```</s>
