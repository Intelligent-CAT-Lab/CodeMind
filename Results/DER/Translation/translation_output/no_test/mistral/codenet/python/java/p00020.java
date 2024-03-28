<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
a=input().upper()
print(a)

```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String a = scanner.nextLine().toUpperCase();
        System.out.println(a);
    }
}
```</s>
