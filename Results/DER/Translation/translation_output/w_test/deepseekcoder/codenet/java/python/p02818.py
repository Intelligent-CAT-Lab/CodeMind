<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

This Python code reads the input from the standard input, splits it into three integers, and then checks if the third integer is less than or equal to the first one. If it is, it subtracts the third integer from the first one. If the third integer is less than or equal to the sum of the first and second integers, it subtracts the difference between the third integer and the first one from the second one and sets the first one to zero. If the third integer is greater than the sum of the first and second integers, it sets both the first and second ones to zero. Finally, it prints the values of the first and second integers.
<|EOT|>
