<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

class atcoder_ABC149_B {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        long A = Long.parseLong(stdIn.next());
        long B = Long.parseLong(stdIn.next());
        long K = Long.parseLong(stdIn.next());
        long n = A - K;
        
        if (A + B <= K) {
            System.out.println("0 0");
        } else if (n < 0) {
            System.out.println("0 " + (A + B - K));
        } else {
            System.out.println(n + " " + B);
        }
    }
}
```

### Response:
```python
import sys

def main():
    A, B, K = map(int, sys.stdin.readline().split())
    n = A - K

    if A + B <= K:
        print("0 0")
    elif n < 0:
        print("0 " + str(A + B - K))
    else:
        print(str(n) + " " + str(B))

if __name__ == "__main__":
    main()
```
<|EOT|>
