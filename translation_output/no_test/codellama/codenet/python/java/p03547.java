<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

A=int(10)
B=int(11)
C=int(12)
D=int(13)
E=int(14)
F=int(15)

N,M=input().split()
if N>M:
  print(">") 
elif N==M:
  print("=")
else:
  print("<")


Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        if (N > M) {
            System.out.println(">");
        } else if (N == M) {
            System.out.println("=");
        } else {
            System.out.println("<");
        }
    }
}
```
Note that in Java, we use the `Scanner` class to read input from the user, and we use the `nextInt()` method to read an integer value from the user. We also use the `System.out.println()` method to print the result to the console.</s>
