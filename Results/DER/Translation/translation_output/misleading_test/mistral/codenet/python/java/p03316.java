<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
12

Expected output:
6-s

```
n = input()

sn = 0

for i in range(len(n)):
    sn += int(n[i])


if (int(n) % sn == 0):
    print("Yes")
else:
    print("No")

```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sn = 0;
        for (int i = 0; i < n; i++) {
            sn += (n % 10);
        }
        if (n % sn == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```</s>
