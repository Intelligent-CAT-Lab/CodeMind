<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
Here is the Java version of the Python code:

```java
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                result.add(Math.max(String.valueOf(i).length(), String.valueOf(n / i).length()));
            }
        }
        int min = result.get(0);
        for (int num : result) {
            if (num < min) {
                min = num;
            }
        }
        System.out.println(min);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the input, then finds all divisors of that integer. For each divisor, it calculates the length of the string representation of the divisor and the quotient of the integer divided by the divisor, and adds the maximum of these two lengths to a list. Finally, it prints the smallest number in the list.
<|EOT|>
