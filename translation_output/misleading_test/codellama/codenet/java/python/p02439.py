<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4 5 3

Expected output:
3 5 -91

```
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

```
[/INST]
```
import math

a, b, c = map(int, input().split())
min = min(a, b)
max = max(a, b)
print(min(min, c), max(max, c))
```
This code uses the `math` module to perform the minimum and maximum operations, and the `map` function to convert the input strings to integers. The `min` and `max` functions are used to find the minimum and maximum of the three numbers, and the `print` function is used to output the result.</s>
