System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```:
```
import java.util.Scanner;
public class p00354 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("thu:fri:sat:sun:mon:tue:wed".split(":")[sc.nextInt()%7]);
    }
}

```


Answer:
```python
import sys

print("thu:fri:sat:sun:mon:tue:wed".split(":")[int(sys.stdin.read())%7])
```<|endoftext|>
