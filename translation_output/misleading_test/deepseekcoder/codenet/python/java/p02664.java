<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
PD?D??P

Expected output:
PDPJDPDP

```
a=input()

a=list(a)

for i in range(len(a)):
	if a[i]=="?":
		a[i]="D"

b=""
for i in range(len(a)):
	b+=a[i]

print(b)
```

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        char[] a = input.toCharArray();

        for (int i = 0; i < a.length; i++) {
            if (a[i] == '?') {
                a[i] = 'D';
            }
        }

        StringBuilder b = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            b.append(a[i]);
        }

        System.out.println(b.toString());
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the input, converts it to a character array, replaces all '?' characters with 'D', and then builds a string from the array. The result is printed to the console.
<|EOT|>
