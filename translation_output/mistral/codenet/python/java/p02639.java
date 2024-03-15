<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
x_list = list(map(int, input().split()))
for i in range(5):
    if x_list[i] == 0:
        print(i+1)
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
        int[] x_list = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            x_list[i] = Integer.parseInt(split[i]);
        }
        for (int i = 0; i < 5; i++) {
            if (x_list[i] == 0) {
                System.out.println(i+1);
            }
        }
    }
}
```</s>
