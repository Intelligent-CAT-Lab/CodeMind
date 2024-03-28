<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
a,b,c=[int(i) for i in input().split()]
if abs(b-c)%2==0:
	print("Alice")
else:
	print("Borys")
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        String input = scanner.nextLine();
        String[] split = input.split(" ");
        a = Integer.parseInt(split[0]);
        b = Integer.parseInt(split[1]);
        c = Integer.parseInt(split[2]);
        if (Math.abs(b - c) % 2 == 0) {
            System.out.println("Alice");
        } else {
            System.out.println("Borys");
        }
    }
}
```</s>
