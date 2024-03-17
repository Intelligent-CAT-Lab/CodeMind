<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 2

Expected output:
0


```
import java.util.Scanner;

public class p03417 {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final long N = sc.nextLong();
        final long M = sc.nextLong();

        System.out.println(Math.abs((N-2) * (M-2)));
    }
}

```
[/INST]
```
import math

N, M = map(int, input().split())
print(abs((N-2) * (M-2)))
```
This code uses the `map()` function to convert the input strings to integers, and then uses the `abs()` function to calculate the absolute value of the product of the two numbers minus 2. Finally, it prints the result to the console.</s>
