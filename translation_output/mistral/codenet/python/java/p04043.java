<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
a,b,c=map(int, input().split())
if sorted(list((a,b,c)))==[5,5,7]:
  print("YES")
else:
  print("NO")
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        if (Arrays.asList(a, b, c).stream().sorted().toList().equals(Arrays.asList(5, 5, 7))) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```</s>
