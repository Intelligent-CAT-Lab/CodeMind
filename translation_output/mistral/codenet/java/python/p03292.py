<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class p03292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int R = sc.nextInt();
        int Y = sc.nextInt();

        int A = Math.max(Math.max(T,R),Y);
        int B = Math.min(Math.min(T,R),Y);

        System.out.println(A-B);
    }
}

```
[/INST]
```python
import sys

T = int(input())
R = int(input())
Y = int(input())

A = max(max(T,R),Y)
B = min(min(T,R),Y)

print(A-B)
```</s>
