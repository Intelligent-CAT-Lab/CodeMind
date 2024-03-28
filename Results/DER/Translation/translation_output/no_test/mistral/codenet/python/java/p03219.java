<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
ab, bc = map(int, input().split())

fare = int(ab + bc/2)

print(fare)


```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the values of ab and bc: ");
        int ab = scanner.nextInt();
        int bc = scanner.nextInt();

        int fare = (ab + bc) / 2;

        System.out.println("The fare is: " + fare);
    }
}
```</s>
