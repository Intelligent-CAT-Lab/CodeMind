<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.Scanner;
// 0306
class p00301 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),a[]=new int[15],i=0;
        while(n>0) {
            a[i++]=(n+1)%3-1;
            n=(n-a[i-1])/3;
        }
        while(i-->0)
            System.out.print((a[i]==0?"0":a[i]>0?"+":"-")+(i==0?"\n":""));
    }
}


Translate the above java code to python.

python code:

[/INST]
```
import sys

n = int(input())
a = [0] * 15
i = 0

while n > 0:
    a[i] = (n + 1) % 3 - 1
    n = (n - a[i]) // 3
    i += 1

while i > 0:
    print((a[i - 1] == 0) * "0" + (a[i - 1] > 0) * "+" + (a[i - 1] < 0) * "-" + (i == 1) * "\n")
    i -= 1
```
This is the Python code equivalent to the Java code you provided. It uses the `input()` function to read the input from the user, and the `print()` function to print the output. The `while` loop is used to iterate over the input number and calculate the corresponding output. The `a` array is used to store the intermediate results, and the `i` variable is used to keep track of the current index in the array. The `print()` function is used to print the output in the desired format.</s>
