<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1905

Expected output:
YYMM


```
n = input()

a = int(n[0]+n[1])
b = int(n[2]+n[3])
if b == 0 or b > 12:
	if 1 <= a <= 12:
		print("MMYY")
	else:
		print("NA")
elif 1 <= a <= 12:
	print("AMBIGUOUS")
else:
	print("YYMM")

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int a = Integer.parseInt(String.valueOf(n).substring(0, 2));
        int b = Integer.parseInt(String.valueOf(n).substring(2, 4));

        if (b == 0 || b > 12) {
            if (1 <= a && a <= 12) {
                System.out.println("MMYY");
            } else {
                System.out.println("NA");
            }
        } else if (1 <= a && a <= 12) {
            System.out.println("AMBIGUOUS");
        } else {
            System.out.println("YYMM");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the input, splits it into two parts, converts them to integers, and then checks the conditions in the Python code to determine the output.
<|EOT|>
