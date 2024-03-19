<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
12

Expected output:
;@G

```
n = int(input())
list_N = list(str(n))
num = 0

for i in list_N:
    num += int(i)
ans = "No"

if n%num == 0:
    ans = "Yes"

print(ans)
```

### Response:
Here is the Java code equivalent to the Python code you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String listN = String.valueOf(n);
        int num = 0;

        for (int i = 0; i < listN.length(); i++) {
            num += Integer.parseInt(String.valueOf(listN.charAt(i)));
        }

        String ans = "No";

        if (n % num == 0) {
            ans = "Yes";
        }

        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the input, converts it to a string to be able to iterate over its digits, calculates the sum of its digits, and then checks if the original number is divisible by this sum. The result is printed to the console.
<|EOT|>
