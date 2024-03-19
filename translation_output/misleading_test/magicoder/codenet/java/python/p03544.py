<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5

Expected output:
-20

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
Here is the equivalent Python code:

```python
n = int(input())
num = [0]*100

for i in range(100):
    if i == 0:
        num[i] = 2
    elif i == 1:
        num[i] = 1
    else:
        num[i] = num[i-1] + num[i-2]

print(num[n])
```

This Python code does the same thing as the Java code. It reads an integer from the user, initializes an array of 100 zeros, and then fills the array with the Fibonacci sequence. Finally, it prints the nth number in the sequence.<｜end▁of▁sentence｜>
