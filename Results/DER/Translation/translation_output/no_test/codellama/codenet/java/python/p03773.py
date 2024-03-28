<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.Scanner;
public class p03773 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int ans = A + B > 23 ? A + B - 24 : A + B;
        System.out.println(ans);
    }
}


Translate the above java code to python.

python code:

[/INST]
```
import sys

A, B = map(int, sys.stdin.readline().split())

ans = A + B - 24 if A + B > 23 else A + B

print(ans)
```
Note: The `map` function is used to convert the input strings to integers. The `sys.stdin.readline()` function is used to read a line of input from the standard input stream. The `split()` method is used to split the input string into two integers. The `if` statement is used to determine whether the sum of `A` and `B` is greater than 23, and if it is, the result is subtracted by 24. Otherwise, the result is simply `A + B`.</s>
