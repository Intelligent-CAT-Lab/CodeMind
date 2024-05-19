System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
999999999 1

Expected output:
1000000000


```
public class codeforces_678_A {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        
        System.out.println((n / k + 1) * k);
    }
}
```


Answer:
```python
import sys

def main():
    n, k = map(int, sys.stdin.readline().split())
    print((n // k + 1) * k)

if __name__ == "__main__":
    main()
```

Test input:
```
999999999 1
```

Expected output:
```
1000000000
```<|endoftext|>
