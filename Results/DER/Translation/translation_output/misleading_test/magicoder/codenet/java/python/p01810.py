<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4 2

Expected output:
5

```
import java.util.*;

public class p01810{
        public static void main(String[] args){
                try(Scanner sc = new Scanner(System.in)){
                        long N = sc.nextLong(), K = sc.nextLong();
                        long ans = 0;
                        for(long i = 0; i < N - 1; i++){
                                ans = K * ((long)(ans / (K - 1))) + ans % (K - 1) + 1;
                        }
                        System.out.println(ans);
                }
        }
}
```

@@ Response
```python
import sys

def main():
    N, K = map(int, sys.stdin.readline().split())
    ans = 0
    for i in range(N - 1):
        ans = K * (ans // (K - 1)) + ans % (K - 1) + 1
    print(ans)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the standard input, calculates the result as described in the Java code, and then prints the result.<｜end▁of▁sentence｜>
