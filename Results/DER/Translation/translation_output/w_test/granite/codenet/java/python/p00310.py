System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10 10 20

Expected output:
40


```
import java.util.*;

public class p00310 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());

        System.out.println(p + m + c);
    }
}


```


Answer:
```python
import sys

def main():
    p, m, c = map(int, sys.stdin.readline().split())
    print(p + m + c)

if __name__ == "__main__":
    main()
```

Test input:
```
10 10 20
```

Expected output:
```
40
```<|endoftext|>
