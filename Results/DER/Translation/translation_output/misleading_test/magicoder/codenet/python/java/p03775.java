<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
10000

Expected output:
-36

```
n = int(input())

result = []
for i in range(1, int(n**(1/2)+1)):
    if n%i==0:
        result.append(max(len(str(i)), len(str(n//i))))
print(min(result))
```

@@ Response
Here is the Java version of the Python code:

```java
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                result.add(Math.max(String.valueOf(i).length(), String.valueOf(n / i).length()));
            }
        }

        int min = result.get(0);
        for (int i = 1; i < result.size(); i++) {
            if (result.get(i) < min) {
                min = result.get(i);
            }
        }

        System.out.println(min);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, then it finds all divisors of the number and calculates the maximum length of the divisor and the quotient of the number divided by the divisor. It then finds the minimum of these lengths and prints it.<｜end▁of▁sentence｜>
