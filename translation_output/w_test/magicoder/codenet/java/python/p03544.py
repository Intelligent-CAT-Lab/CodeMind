<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5

Expected output:
11


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
def fibonacci(n):
    num = [0] * 100
    num[0] = 2
    num[1] = 1
    for i in range(2, n+1):
        num[i] = num[i-1] + num[i-2]
    return num[n]

n = int(input())
print(fibonacci(n))
```

This Python code does the same thing as the Java code. It calculates the Fibonacci sequence up to the nth term and then prints the nth term. The input is read from the standard input.<｜end▁of▁sentence｜>
