<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
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

@@ Response
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

This Python code does the same thing as the Java code. It reads three integers from the standard input, and then performs the same operations as the Java code. The `sys.stdin.readline().split()` function is used to read the input, and the `map()` function is used to convert the input strings to integers. The `if` statements are used to perform the same operations as the Java code. The `print()` function is used to output the results.<｜end▁of▁sentence｜>
