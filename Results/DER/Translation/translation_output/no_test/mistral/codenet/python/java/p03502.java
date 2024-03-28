<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
n = int(input())
list_N = list(str(n))
num = 0

for i in list_N:
    num += int(i)
ans = "No"

if n%num == 0:
    ans = "Yes"

print(ans)
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String list_N = Integer.toString(n);
        int num = 0;

        for (int i = 0; i < list_N.length(); i++) {
            num += Integer.parseInt(list_N.charAt(i) + "");
        }

        String ans = "No";

        if (n % num == 0) {
            ans = "Yes";
        }

        System.out.println(ans);
    }
}
```</s>
