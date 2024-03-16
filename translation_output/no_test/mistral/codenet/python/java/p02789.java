<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
a = [int(i) for i in input().split()]
if a[0] == a[1]:
  print('Yes')
else:
  print('No')
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] a = input.split(" ");
        int first = Integer.parseInt(a[0]);
        int second = Integer.parseInt(a[1]);
        if (first == second) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```</s>
