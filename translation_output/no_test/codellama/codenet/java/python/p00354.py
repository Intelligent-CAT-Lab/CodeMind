<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.Scanner;
public class p00354 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("thu:fri:sat:sun:mon:tue:wed".split(":")[sc.nextInt()%7]);
    }
}


Translate the above java code to python.

python code:

[/INST]
```
import sys

days = "thu:fri:sat:sun:mon:tue:wed".split(":")

day = days[int(sys.stdin.readline()) % 7]

print(day)
```
This code uses the `split()` method to split the string "thu:fri:sat:sun:mon:tue:wed" into a list of days, and then uses the `int()` function to convert the input from the user to an integer. The `%` operator is used to get the remainder of the division of the input by 7, which is used as an index into the list of days. Finally, the `print()` function is used to print the selected day.</s>
