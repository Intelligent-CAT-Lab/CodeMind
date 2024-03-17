<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
103

Expected output:
3


```
import java.util.Scanner;

class p02694 {

    public static void main(String[] args) {
        Scanner stdIn=new Scanner(System.in);

        long x=stdIn.nextLong();
        int count=0;

        long a=100;
        while(true){
            if(a>=x){
                break;
            }
            a=a+a/100;
            count++;
        }
        System.out.println(count);
        
    }

}
```
[/INST]
```
import sys

x = int(sys.stdin.readline())

count = 0
a = 100
while True:
    if a >= x:
        break
    a = a + a // 100
    count += 1

print(count)
```
This code reads a single integer from standard input using the `sys.stdin.readline()` method, and then uses a while loop to calculate the number of times the input number is greater than or equal to 100, 1000, 10000, and so on, until it reaches the input number. The `//` operator is used to perform integer division and the `count` variable is incremented each time the input number is greater than or equal to 100, 1000, 10000, and so on. Finally, the `print` function is used to output the final value of `count`.</s>
