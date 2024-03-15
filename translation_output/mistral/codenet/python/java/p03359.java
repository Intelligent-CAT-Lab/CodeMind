<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
a,b = map(int,input().rstrip().split())
if a>b:
    print(a-1)
else:
    print(a)
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a and b separated by a space: ");
        String input = scanner.nextLine();
        String[] split = input.split(" ");
        int a = Integer.parseInt(split[0]);
        int b = Integer.parseInt(split[1]);
        if (a > b) {
            System.out.println(a - 1);
        } else {
            System.out.println(a);
        }
    }
}
```</s>
