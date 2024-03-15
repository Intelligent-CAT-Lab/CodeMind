<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
abc = list(map(int, input().split()))
abc.sort()
print(int(str(abc[2]) + str(abc[1])) + abc[0])
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
        int[] abc = new int[3];
        for (int i = 0; i < 3; i++) {
            abc[i] = Integer.parseInt(split[i]);
        }
        Arrays.sort(abc);
        System.out.println(Integer.parseInt(String.valueOf(abc[2]) + String.valueOf(abc[1])) + abc[0]);
    }
}
```</s>
