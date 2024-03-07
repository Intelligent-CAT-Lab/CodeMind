<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.Scanner;
public class p03351{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int ab = Math.abs(a-b);
        int ac = Math.abs(a-c);
        int bc = Math.abs(b-c);
        if(ac <= d || (ab <= d && bc <= d)){
            System.out.println("Yes");
        } else{
            System.out.println("No");
        }
    }
}

Translate the above java code to python.

python code:

[/INST]
```
import math

a, b, c, d = map(int, input().split())
ab = abs(a - b)
ac = abs(a - c)
bc = abs(b - c)

if ac <= d or (ab <= d and bc <= d):
    print("Yes")
else:
    print("No")
```
Note: The `map` function is used to convert the input from a string to an integer. The `abs` function is used to calculate the absolute value of the difference between two numbers. The `or` operator is used to check if either condition is true.</s>
