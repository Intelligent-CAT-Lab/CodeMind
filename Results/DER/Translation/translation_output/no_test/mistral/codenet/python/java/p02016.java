<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
print('square1001' if input()=='ani' else 'e869120')


```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String output = input.equals("ani") ? "square1001" : "e869120";
        System.out.println(output);
    }
}
```</s>
