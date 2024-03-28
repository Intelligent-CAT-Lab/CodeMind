<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

n = int(input())
A = list()
for i in range(1,n+1):
    if i % 3 == 0:
        A.append(i)
    elif "3" in str(i):
        A.append(i)
print(" ", end="")
for i in range(len(A)-1):
    print(A[i], end=" ")
print(A[len(A)-1])



Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] A = new int[n];
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                A[i] = i;
            } else if (String.valueOf(i).contains("3")) {
                A[i] = i;
            }
        }
        System.out.print(" ");
        for (int i = 0; i < A.length - 1; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println(A[A.length - 1]);
    }
}
```
Note that in Java, we use the `String.valueOf(i)` method to convert the integer `i` to a string, and the `String.contains("3")` method to check if the string contains the character "3".

Also, in Java, we use the `System.out.print()` method to print the output, and the `System.out.println()` method to print the output and start a new line.

I hope this helps! Let me know if you have any questions.</s>
