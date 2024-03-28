<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
happy,newyear,enjoy

Expected output:
happy newyear

```
s = input()
print(s.replace(",", " "))
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String output = input.replace(",", " ");
        System.out.println(output);
    }
}
```</s>
