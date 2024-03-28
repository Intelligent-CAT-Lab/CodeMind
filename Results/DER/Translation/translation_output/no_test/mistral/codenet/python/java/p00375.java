<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
x = input()
x = int(x)
y = (x-30)/2
print(int(y))

```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = scanner.nextInt();
        int y = (x - 30) / 2;
        System.out.println(y);
    }
}
```</s>
