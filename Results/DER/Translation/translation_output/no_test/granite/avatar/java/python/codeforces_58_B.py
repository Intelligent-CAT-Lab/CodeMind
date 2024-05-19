System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```:
```
import java.util.*;
import java.lang.*;
import java.io.*;

public class codeforces_58_B {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n + " ");
        int m = n;
        for (int i = n - 1; i > 0; i--) {
            if (m % i == 0) {
                System.out.println(i + " ");
                m = i;
            }
        }
    }
}
```


Answer:
```python
import sys

def main():
    n = int(input())
    print(n, end=" ")
    m = n
    for i in range(n - 1, 0, -1):
        if m % i == 0:
            print(i, end=" ")
            m = i

if __name__ == "__main__":
    sys.exit(main())
```<|endoftext|>
