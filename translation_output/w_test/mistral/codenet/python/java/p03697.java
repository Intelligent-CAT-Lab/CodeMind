<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
6 3

Expected output:
9


```
a,b=input().split();print([int(a)+int(b),'error'][int(a)+int(b)>=10])

```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] a = input.split(" ");
        int sum = Integer.parseInt(a[0]) + Integer.parseInt(a[1]);
        if (sum >= 10) {
            System.out.println("error");
        } else {
            System.out.println(sum);
        }
    }
}
```</s>
