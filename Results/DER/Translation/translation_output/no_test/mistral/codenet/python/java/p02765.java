<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
n,r = [int(x) for x in input().split()]

if n < 10:
    print(r + (100 * (10 - n)))
else:
    print(r)
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n and r separated by space: ");
        String input = scanner.nextLine();
        String[] split = input.split(" ");
        int n = Integer.parseInt(split[0]);
        int r = Integer.parseInt(split[1]);

        if (n < 10) {
            System.out.println(r + (100 * (10 - n)));
        } else {
            System.out.println(r);
        }
    }
}
```</s>
