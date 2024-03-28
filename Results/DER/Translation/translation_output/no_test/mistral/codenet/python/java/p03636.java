<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
a,*b,c = input()
print(a+str(len(b))+c)

```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] values = input.split(",");
        String a = values[0];
        String b = values[1];
        String c = values[2];
        System.out.println(a + Integer.toString(b.length()) + c);
    }
}
```</s>
