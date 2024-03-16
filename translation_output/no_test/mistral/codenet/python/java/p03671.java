<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
abc = list(map(int, input().split()))
abc.sort()
print(abc[0] + abc[1])
```
[/INST]
```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] split = input.split(" ");
        int[] abc = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            abc[i] = Integer.parseInt(split[i]);
        }
        Arrays.sort(abc);
        System.out.println(abc[0] + abc[1]);
    }
}
```</s>
