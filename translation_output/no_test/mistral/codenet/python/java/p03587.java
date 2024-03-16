<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
s = input()
print(s.count("1"))

```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = scanner.nextLine();
        int count = s.count("1");
        System.out.println("The number of occurrences of '1' in the string is: " + count);
    }
}
```</s>
