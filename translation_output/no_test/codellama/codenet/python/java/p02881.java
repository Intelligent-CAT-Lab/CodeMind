<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

from math import *
n = int(input())

def ij(x):
    for i in range(x, 0, -1):
        if n/i == n//i:
            return i, n//i

print(sum(ij(int(sqrt(n)))) - 2)

Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int i = (int) Math.sqrt(n);
        int j = n / i;

        System.out.println(i + " " + j);
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `Math` class to perform mathematical operations. The `sqrt` method is used to calculate the square root of `n`, and the `/` operator is used to divide `n` by the square root to get `j`. Finally, the `println` method is used to print the result.

Note that in Java, the `sqrt` method returns a `double` value, so we need to cast it to an `int` to get the integer part of the square root.</s>
