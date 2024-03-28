<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

a, b = map(int, input().split())

tower_dis = b - a
b_height = tower_dis * (tower_dis + 1) // 2
ans = b_height - b

print(ans)

Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```
import java.util.Scanner;

public class Tower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int towerDis = b - a;
        int bHeight = towerDis * (towerDis + 1) / 2;
        int ans = bHeight - b;
        System.out.println(ans);
    }
}
```
Note that the `Scanner` class is used to read input from the user, and the `nextInt()` method is used to read an integer value from the user. The `println()` method is used to print the result to the console.</s>
