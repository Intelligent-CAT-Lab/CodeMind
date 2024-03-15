<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
f, t = [int(i) for i in input().split()]
print(len([i for i in range(f, t+1) if str(i) == str(i)[::-1]]))
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int f = scanner.nextInt();
        int t = scanner.nextInt();
        int count = 0;
        for (int i = f; i <= t; i++) {
            if (isPalindrome(i)) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean isPalindrome(int num) {
        String str = Integer.toString(num);
        return str.equals(str.substring(0, str.length() - 1));
    }
}
```</s>
