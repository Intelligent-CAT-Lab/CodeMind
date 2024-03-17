<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
8 13

Expected output:
2


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

public class Tower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int towerDis = b - a;
        int bHeight = towerDis * (towerDis + 1) / 2;
        int ans = bHeight - b;
        System.out.println(ans);
    }
}
```
This code uses the `Scanner` class to read input from the user, and then uses the `nextInt()` method to read the two integers `a` and `b`. It then calculates the distance between the two towers using the formula `b - a`, and the height of the second tower using the formula `towerDis * (towerDis + 1) / 2`. Finally, it calculates the difference between the two heights and prints the result.</s>
