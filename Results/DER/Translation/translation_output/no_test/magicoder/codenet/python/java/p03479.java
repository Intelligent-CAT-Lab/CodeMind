<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
 #a = 314159265
#b = 358979323846264338
a, b = map(int, input().split())
count = 1
x = a
#print(x)
while x * 2 <= b:
    x = x * 2
    #print(x)
    count += 1
print(count)
```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        int count = 1;
        long x = a;
        while (x * 2 <= b) {
            x = x * 2;
            count += 1;
        }
        System.out.println(count);
    }
}
```

Please note that in Java, the `long` data type is used to store integer values larger than `int`. The `Scanner` class is used to read input from the user. The `while` loop continues until `x * 2` is greater than `b`. The `count` variable is incremented by 1 in each iteration of the loop. The final value of `count` is then printed to the console.<｜end▁of▁sentence｜>
