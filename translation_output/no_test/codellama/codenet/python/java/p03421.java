<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

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

Translate the above python code to java.

java code:

[/INST]
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (n < a + (b - 1) || n > a + (b - 1) * a) {
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
        int loop = n / (b - 1);
        int option = n % (b - 1);
        for (int j = 0; j < b - 1; j++) {
            if (option > 0) {
                for (int i = 0; i < loop + 1; i++) {
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
This is the Java code for the given Python code. It uses the `Scanner` class to read input from the user, and the `System.out.print()` method to print the output. The logic is similar to the Python code, with some minor differences in syntax.</s>
