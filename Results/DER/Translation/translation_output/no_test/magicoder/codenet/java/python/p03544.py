<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
public class p03544{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] num = new long[100];

        for(int i =0;i<100;i++){
            if(i==0){
                num[i]=2;
            }else if(i==1){
                num[i]=1;
            }else{
            num[i] = num[i-1]+num[i-2];
        }
    }

        System.out.println(num[n]);
        

    }
}


```

@@ Response
```python
import sys

def fibonacci(n):
    num = [0] * 100
    num[0] = 2
    num[1] = 1
    for i in range(2, n+1):
        num[i] = num[i-1] + num[i-2]
    return num[n]

if __name__ == "__main__":
    n = int(sys.stdin.readline())
    print(fibonacci(n))
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, calculates the nth Fibonacci number, and prints it. The Fibonacci sequence is calculated in the `fibonacci` function, which is then called in the `main` function.<｜end▁of▁sentence｜>
