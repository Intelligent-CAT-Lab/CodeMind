Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
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

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (n < a + (b-1) || n > a + (b-1) * a) {
            System.out.println("-1");
            return;
        }
        for (int i = 0; i < a; i++) {
            System.out.print(n - a + i + 1 + " ");
        }
        n -= a;
        if (n == 0) {
            System.out.println("");
            return;
        }
        int loop = n / (b-1);
        int option = n % (b-1);
        for (int j = 0; j < b-1; j++) {
            if (option > 0) {
                for (int i = 0; i <= loop; i++) {
                    System.out.print(n - loop - 1 + i + 1 + " ");
                }
                n -= loop + 1;
                option--;
            } else {
                for (int i = 0; i < loop; i++) {
                    System.out.print(n - loop + i + 1 + " ");
                }
                n -= loop;
            }
        }
        System.out.println("");
    }
}
```<|endoftext|>
