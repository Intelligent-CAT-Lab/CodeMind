<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 3 3

Expected output:
0 2


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

This Python code does the same thing as the Java code. It reads three integers from the standard input, and then checks if the third integer is less than or equal to the first integer. If it is, it subtracts the third integer from the first integer. If it's not, it checks if the third integer is less than or equal to the sum of the first and second integers. If it is, it subtracts the difference between the third integer and the first integer from the second integer and sets the first integer to 0. If it's not, it sets both integers to 0. Finally, it prints the two integers separated by a space.<｜end▁of▁sentence｜>
