<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
a=raw_input().split()
print(int(a[0])*int(a[1]))


```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] a = input.split(" ");
        int result = Integer.parseInt(a[0]) * Integer.parseInt(a[1]);
        System.out.println(result);
    }
}
```</s>
