<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 3 2

Expected output:
2 4 1 5 3


```
n, a, b = [int(item) for item in input().split()]
if n < a + (b-1) or n > a + (b-1) * a:
    print(-1)
    exit()
for i in range(a):
    print(n - a + i + 1, end=" ")
n -= a
if n == 0:
    print("")
    exit()
loop = n // (b-1)
option = n % (b-1)
for j in range(b-1):
    if option > 0:
        for i in range(loop+1):
            print(n - loop - 1 + i + 1, end=" ")
        n -= loop + 1
        option -= 1
    else:
        for i in range(loop):
            print(n - loop + i + 1, end=" ")
        n -= loop
print("")
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (n < a + (b-1) || n > a + (b-1) * a) {
            System.out.println(-1);
            return;
        }
        for (int i = 0; i < a; i++) {
            System.out.print(n - a + i + 1 + " ");
        }
        n -= a;
        if (n == 0) {
            System.out.println();
            return;
        }
        int loop = n / (b-1);
        int option = n % (b-1);
        for (int j = 0; j < b-1; j++) {
            if (option > 0) {
                for (int i = 0; i < loop+1; i++) {
                    System.out.print(n - loop - 1 + i + 1 + " ");
                }
                n -= loop + 1;
                option -= 1;
            } else {
                for (int i = 0; i < loop; i++) {
                    System.out.print(n - loop + i + 1 + " ");
                }
                n -= loop;
            }
        }
        System.out.println();
    }
}
```
This code first reads the input from the user, and then checks if the input is valid. If the input is not valid, it prints -1 and exits the program.

Otherwise, it prints the first `a` numbers in the sequence, and then updates the value of `n` accordingly.

After that, it calculates the number of loops needed to print the remaining numbers in the sequence, and the number of options needed to print the remaining numbers in the sequence.

It then uses a for loop to print the remaining numbers in the sequence, using the `loop` and `option` variables to determine how many numbers to print in each loop.

Finally, it prints a newline character to end the output.</s>
