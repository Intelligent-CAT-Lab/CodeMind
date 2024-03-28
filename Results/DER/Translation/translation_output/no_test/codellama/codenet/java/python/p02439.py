<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.*;
public class p02439 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int min = Math.min(a,b);
        int max = Math.max(a,b);
        System.out.println(Math.min(min,c)+" "+Math.max(max,c));
    }
}


Translate the above java code to python.

python code:

[/INST]
```
import math

a, b, c = map(int, input().split())

min_value = min(a, b)
max_value = max(a, b)

print(min(min_value, c), max(max_value, c))
```
In this code, we first import the `math` module, which provides the `min` and `max` functions that we will use to find the minimum and maximum values of the input numbers.

We then use the `map` function to convert the input string into a list of integers, and assign the first three elements of the list to the variables `a`, `b`, and `c`.

Next, we use the `min` and `max` functions to find the minimum and maximum values of `a` and `b`, and assign the results to the variables `min_value` and `max_value`.

Finally, we use the `min` and `max` functions again to find the minimum and maximum values of `min_value` and `c`, and print the results.

Note that in Python, we can use the `min` and `max` functions to find the minimum and maximum values of a list of numbers, so we don't need to use the `math` module for this.</s>
