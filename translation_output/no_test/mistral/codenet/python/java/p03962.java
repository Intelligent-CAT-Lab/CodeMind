<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
print(len(set(list(map(int, input().split())))))

```
[/INST]
```java
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] split = input.split(" ");
        int[] ints = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            ints[i] = Integer.parseInt(split[i]);
        }
        Set<Integer> set = new HashSet<>(Arrays.asList(ints));
        System.out.println(set.size());
    }
}
```</s>
