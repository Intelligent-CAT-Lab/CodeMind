<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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


Translate the above java code to python.

python code:

[/INST]
```
import math

a = int(input("Enter the first number: "))
b = int(input("Enter the second number: "))

ans = math.abs(a - b)

print(ans)
```
In this code, we first import the `math` module, which provides the `abs()` function for calculating the absolute value of a number.

We then prompt the user to enter two numbers, `a` and `b`, using the `input()` function. We convert the input strings to integers using the `int()` function.

Next, we calculate the absolute difference between `a` and `b` using the `abs()` function, and store the result in the `ans` variable.

Finally, we print the result using the `print()` function.</s>
