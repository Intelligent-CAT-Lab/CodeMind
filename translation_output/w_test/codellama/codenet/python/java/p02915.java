<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2

Expected output:
8


```
import sys
for n in sys.stdin:
	n = int(n.split()[0])
	print(n ** 3)
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            System.out.println(n * n * n);
        }
    }
}
```
This code reads an integer from the standard input using the `Scanner` class, and then prints the cube of that integer to the standard output. The `while` loop continues until there are no more integers to read from the input.</s>
