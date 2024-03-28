<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 3 3

Expected output:
0 2 44

```
import java.io.*;
import java.util.*;

public class p02818{
    static public void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //String[] buf = reader.readLine().split(" ");
        long A = sc.nextLong(), B = sc.nextLong(), K = sc.nextLong();
        if(K<=A){
            A -= K;
        } else if(K <= A+B){
            B -= K-A;
            A = 0;
        } else {
            A = 0; B = 0;
        }
        System.out.println(A+" "+B);
    }
}


```

### Response:
```python
import sys

def main():
    A, B, K = map(int, sys.stdin.readline().split())
    if K <= A:
        A -= K
    elif K <= A + B:
        B -= K - A
        A = 0
    else:
        A = 0
        B = 0
    print(A, B)

if __name__ == "__main__":
    main()
```

This Python code reads three integers from the standard input, and then performs the same operations as the Java code. It prints the final values of A and B.
<|EOT|>
