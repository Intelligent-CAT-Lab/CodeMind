<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
import sys
for n in sys.stdin:
	n = int(n.split()[0])
	print(n ** 3)
```
[/INST]
```java
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            System.out.println(n * n * n);
        }
    }
}
```</s>
