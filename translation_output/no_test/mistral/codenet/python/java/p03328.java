<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
a, b = map(int, input().split())

tower_dis = b - a
b_height = tower_dis * (tower_dis + 1) // 2
ans = b_height - b

print(ans)
```
[/INST]
```java
import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int tower_dis = b - a;
        int b_height = (tower_dis * (tower_dis + 1)) / 2;
        int ans = b_height - b;

        System.out.println(ans);
    }
}
```</s>
