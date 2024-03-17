<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3

Expected output:
1.000000000000


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
Note: The `Math.pow()` method is used to calculate the cube of a number. The `double` data type is used to represent the result of the division operation, which is a floating-point number.</s>
