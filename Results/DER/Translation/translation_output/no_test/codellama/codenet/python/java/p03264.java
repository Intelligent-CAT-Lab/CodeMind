<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

import math
k=int(input())
print(math.ceil(k/2)*(k//2))

Translate the above python code to java.

java code:

[/INST]

Here is the Java code that translates the Python code:
```
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        System.out.println(Math.ceil(k / 2) * (k / 2));
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `Math` class to perform the necessary mathematical operations. The `Math.ceil()` method is used to round up the result of the division to the nearest integer, and the `Math.floor()` method is used to round down the result to the nearest integer. The `*` operator is used to multiply the rounded result by the original input.</s>
