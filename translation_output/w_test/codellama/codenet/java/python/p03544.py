<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

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
[/INST]
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

The above code is a Java program that takes an integer `n` as input and prints the `n`th Fibonacci number. The program uses a dynamic programming approach to calculate the Fibonacci numbers.

Here's the equivalent Python code:
```
import sys

n = int(sys.stdin.readline())
num = [0] * 100

for i in range(100):
    if i == 0:
        num[i] = 2
    elif i == 1:
        num[i] = 1
    else:
        num[i] = num[i-1] + num[i-2]

print(num[n])
```
The Python code uses the `sys` module to read the input from the standard input stream, and the `range` function to iterate over the indices of the `num` array. The `if` statements are used to set the initial values of the `num` array, and the `else` clause is used to calculate the Fibonacci numbers using the recurrence relation. Finally, the `print` function is used to print the `n`th Fibonacci number.</s>
