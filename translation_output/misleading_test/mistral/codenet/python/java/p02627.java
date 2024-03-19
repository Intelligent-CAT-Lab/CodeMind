<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
B

Expected output:
A

```
n = input()

if n.isupper():
    print("A")
elif n.islower():
    print("a")
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();

        if (n.isUpperCase()) {
            System.out.println("A");
        } else if (n.isLowerCase()) {
            System.out.println("a");
        }
    }
}
```</s>
