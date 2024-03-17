<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
8 8

Expected output:
1


```
import java.util.Scanner;

public class atcoder_ABC139_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int kuti = 1;
        int tap = 0;
        
        while (kuti < b) {
            kuti = kuti - 1 + a;
            tap++;
        }
        
        System.out.println(tap);
    }
}
```

### Response:
```python
a, b = map(int, input().split())
kuti = 1
tap = 0

while kuti < b:
    kuti = kuti - 1 + a
    tap += 1

print(tap)
```
<|EOT|>
