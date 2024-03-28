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

This Java code does the same thing as the Python code. It reads an integer from the standard input, and if the integer is 1 or 2, it prints the corresponding output. If the integer is greater than 2, it prints the integer minus 1, and then prints a series of strings of the form "10...01" (with '0' repeated 'i' times).

Please note that the `repeat(i)` function is available from Java 11. If you are using an older version of Java, you can use a for loop to repeat the string:

```java
for (int j = 0; j < i; j++) {
    System.out.print("0");
}
```

instead of `"0".repeat(i)`.
<|EOT|>
