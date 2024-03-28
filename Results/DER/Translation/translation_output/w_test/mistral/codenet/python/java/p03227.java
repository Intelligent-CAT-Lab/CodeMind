<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
abc

Expected output:
cba


```
l=input()
if len(l)==2:
    print(l)
else:
    print(l[::-1])
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.length() == 2) {
            System.out.println(input);
        } else {
            System.out.println(input.substring(0, input.length() - 1).reverse());
        }
    }
}
```</s>
