System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 6 3

Expected output:
-38

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


Answer:
```python
import sys

def main():
    T, R, Y = map(int, sys.stdin.readline().split())
    A = max(T, R, Y)
    B = min(T, R, Y)
    print(A - B)

if __name__ == "__main__":
    main()
```

Test input:
```
1 6 3
```

Expected output:
```
-38
```<|endoftext|>
