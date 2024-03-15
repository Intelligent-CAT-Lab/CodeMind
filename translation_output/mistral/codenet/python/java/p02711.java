<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
N = input()

if "7" in N:
    print("Yes")
else:
    print("No")
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String N = scanner.nextLine();
        if (N.contains("7")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```</s>
