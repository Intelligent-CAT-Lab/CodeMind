<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
A,B=[int(i) for i in input().split(" ")]
print(A+B)


```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] split = input.split(" ");
        int A = Integer.parseInt(split[0]);
        int B = Integer.parseInt(split[1]);
        System.out.println(A + B);
    }
}
```</s>
