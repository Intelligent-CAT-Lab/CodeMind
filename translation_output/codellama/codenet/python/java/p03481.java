<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

import math

n = list(map(int,input().split()))
X = n[0]
Y = n[1]

k = (Y//X).bit_length()
print(k)

Translate the above python code to java.

java code:

[/INST]

Here is the Java code that translates the Python code:
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] n = scanner.nextLine().split(" ").map(Integer::parseInt).toArray(int[]::new);
        int X = n[0];
        int Y = n[1];

        int k = (int) Math.floor(Math.log(Y / X) / Math.log(2));
        System.out.println(k);
    }
}
```
Note that the `map` method in Java is used to convert the input string to an array of integers, and the `toArray` method is used to convert the `List` object to an array. The `Math.log` method is used to calculate the logarithm of the input values, and the `Math.floor` method is used to round the result down to the nearest integer.</s>
