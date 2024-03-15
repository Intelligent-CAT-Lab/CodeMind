<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
h, a, b = map(int, input().split())
print([(h%(a+c)==0) for c in range(b-a+1)].count(True))

```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int count = 0;
        for (int c = a; c <= b; c++) {
            if (h % (a + c) == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```</s>
