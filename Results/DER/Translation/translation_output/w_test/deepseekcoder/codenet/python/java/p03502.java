<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
12

Expected output:
Yes


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
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String nStr = Integer.toString(n);
        char[] chars = nStr.toCharArray();
        int sum = 0;
        for (char c : chars) {
            sum += Character.getNumericValue(c);
        }
        String ans = "No";
        if (n % sum == 0) {
            ans = "Yes";
        }
        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the input, converts it to a string, and then to a char array. It then iterates over the array, adding the numeric value of each character to a sum. If the original number is divisible by this sum, it prints "Yes", otherwise it prints "No".
<|EOT|>
