System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
20 2

Expected output:
116

```

import java.util.Scanner;

public class p00290 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int d = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(d*c);

    }
}


```


Answer:
```python
import sys

def main():
    d, c = map(int, sys.stdin.readline().split())
    print(d * c)

if __name__ == "__main__":
    main()
```

Test input:
```
20 2
```

Expected output:
```
116
```<|endoftext|>
