System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```:
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


Answer:
```python
import sys

x = int(sys.stdin.readline())
a = int(sys.stdin.readline())
b = int(sys.stdin.readline())

if abs(x - a) < abs(x - b):
    print("A")
else:
    print("B")
```<|endoftext|>
