<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4 5

Expected output:
Possibli

```
import java.util.Scanner;

public class p03657 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if( a % 3 == 0 || b % 3 == 0 || (a + b) % 3 == 0) System.out.println("Possible");
        else System.out.println("Impossible");
    }
}
```
[/INST]
```python
a = int(input())
b = int(input())
if (a % 3 == 0 or b % 3 == 0 or (a + b) % 3 == 0):
    print("Possible")
else:
    print("Impossible")
```</s>
