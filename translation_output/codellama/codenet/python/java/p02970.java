<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

def solve():
    n, d = map(int, input().split())
    print(-(-n//(2*d+1)))


if __name__ == '__main__':
    solve()


Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int d = scanner.nextInt();
        System.out.println(-(-n / (2 * d + 1)));
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `nextInt()` method to read the two integers `n` and `d`. The `println()` method is used to print the result of the calculation.

Note that the Python code uses the `//` operator to perform integer division, which is equivalent to the `floor()` method in Java. The `floor()` method returns the largest integer less than or equal to the argument, which is equivalent to the Python code's `//` operator.</s>
