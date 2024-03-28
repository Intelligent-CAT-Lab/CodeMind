<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2

Expected output:
2
0
11
-87

```
n=input()

if n==1:
	print "1\n0"
elif n==2:
	print "2\n0\n11"
else:
	print n-1
	for i in xrange(n-1):
		print "1"+("0"*i)+"1"


```

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        if (n == 1) {
            System.out.println("1\n0");
        } else if (n == 2) {
            System.out.println("2\n0\n11");
        } else {
            System.out.println(n - 1);
            for (int i = 0; i < n - 1; i++) {
                System.out.println("1" + "0".repeat(i) + "1");
            }
        }
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, and then prints the appropriate output based on the value of `n`. If `n` is 1 or 2, it prints a specific string. If `n` is greater than 2, it prints `n-1` followed by `n-1` lines of the form "10...01" (with `n-1` zeros).

Please note that the `repeat(i)` function is available from Java 11. If you are using an older version of Java, you can use a for loop to repeat the string:

```java
for (int j = 0; j < i; j++) {
    System.out.print("0");
}
```

This will replace the line `System.out.println("1" + "0".repeat(i) + "1");` in the Java code.
<|EOT|>
