System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 1

Expected output:
3800


```
import java.util.*;

public class p03549 {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    int M = sc.nextInt();

    sc.close();

    int X = 1900 * M + 100 * (N - M);

    int rate = 1;

    for (int i = 1; i <= M; i++){
      rate *= 2;
    }

    System.out.println(rate * X);

  }

}
```


Answer:
```python
import sys

def main():
    N, M = map(int, sys.stdin.readline().split())
    X = 1900 * M + 100 * (N - M)
    rate = 1
    for i in range(1, M + 1):
        rate *= 2
    print(rate * X)

if __name__ == "__main__":
    main()
```

Test input:
```
1 1
```

Expected output:
```
3800
```<|endoftext|>
