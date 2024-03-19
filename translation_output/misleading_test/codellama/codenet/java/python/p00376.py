<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
20 30

Expected output:
23

```
import java.util.Scanner;

public class p00376
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int ans=0;

        int a=sc.nextInt();
        int b=sc.nextInt();
        
        ans=Math.abs(a-b);

        System.out.println(ans);
    }
}

```
[/INST]
```
import math

a = int(input())
b = int(input())

ans = math.abs(a - b)

print(ans)
```
Explanation:

* The `math.abs()` function is used to calculate the absolute value of a number.
* The `input()` function is used to read a line of input from the user.
* The `int()` function is used to convert the input to an integer.
* The `print()` function is used to print the result to the console.

Note: The `math.abs()` function is used instead of the `abs()` function because the `abs()` function is not defined in the `math` module.</s>
