<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
25

Expected output:
+0-+


```
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

```
[/INST]
```python
import sys

def main():
    n = int(sys.stdin.readline().strip())
    a = [0] * 15
    i = 0
    while n > 0:
        a[i] = (n + 1) % 3 - 1
        n = (n - a[i]) // 3
        i += 1
    while i > 0:
        print((a[i - 1] == 0) * "0" + (a[i - 1] > 0) * "+" + (a[i - 1] < 0) * "-" + (i == 1) * "\n")
        i -= 1

if __name__ == "__main__":
    main()
```
This is a Python implementation of the Java code provided. The code uses the `sys` module to read input from stdin and the `int` function to convert the input to an integer. The `a` array is initialized with 15 zeros, and the `i` variable is used to keep track of the index in the array. The `while` loop iterates until `n` is greater than 0, and for each iteration, the code calculates the next digit of the number and stores it in the `a` array. The `while` loop at the end of the code prints the digits of the number in reverse order, using the `print` function to print the digits and the `i` variable to keep track of the index in the array.</s>
