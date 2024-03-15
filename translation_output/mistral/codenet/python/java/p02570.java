<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
data=list(map(int,input().split()))
if data[0]/data[1]<=data[2]:
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
        String[] data = input.split(" ");
        int first = Integer.parseInt(data[0]);
        int second = Integer.parseInt(data[1]);
        int third = Integer.parseInt(data[2]);
        if (first <= second && second <= third) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```</s>
