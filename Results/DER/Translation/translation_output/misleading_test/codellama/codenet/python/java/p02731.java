<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3

Expected output:
-29.561930693928545

```
# -*- coding: utf-8 -*-

L = int(input())
hen = L/3
print(hen**3)

```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();
        double hen = L/3.0;
        System.out.println(Math.pow(hen, 3));
    }
}
```
This code first prompts the user to enter an integer value for `L`, then it calculates the value of `hen` as `L/3.0`, which is a double value. Finally, it prints the cube of `hen` using the `Math.pow()` method.

Note that in Java, the `**` operator is not supported for double values, so we need to use the `Math.pow()` method instead. Also, the `input()` function in Python returns a string, so we need to convert it to an integer using `int(input())` in Java.</s>
