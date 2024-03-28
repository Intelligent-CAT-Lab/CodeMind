<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 14

Expected output:
2


```
import java.util.*;public class p03241{public static void main(String[]a){Scanner s=new Scanner(System.in);int n=s.nextInt();int m=s.nextInt();for(int i=m/n;true;i--)if(m%i==0){System.out.print(i);break;}}}

```
[/INST]
```
import java.util.Scanner;

public class p03241 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        for (int i = m / n; true; i--) {
            if (m % i == 0) {
                System.out.print(i);
                break;
            }
        }
    }
}
```

In Python, we can use the `input()` function to read the input from the user, and the `print()` function to print the output. We can also use the `//` operator to perform integer division and the `%` operator to perform modulo division.

Here's the Python code for the same program:
```
n = int(input())
m = int(input())

for i in range(m // n, 0, -1):
    if m % i == 0:
        print(i)
        break
```
Note that in Python, we don't need to explicitly create a `Scanner` object to read input from the user, as the `input()` function does that for us. Additionally, the `range()` function in Python takes three arguments: the start value, the stop value, and the step value. In this case, we're using the `range()` function to generate a sequence of numbers from `m // n` to 0, with a step value of -1.</s>
