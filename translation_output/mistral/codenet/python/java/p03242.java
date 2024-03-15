<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
moji = str(input())
ans = ""
for i in range(len(moji)):
    ans += ("1","9")[moji[i]=="1"]
print(ans)
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String moji = scanner.nextLine();
        String ans = "";
        for (int i = 0; i < moji.length(); i++) {
            if (moji.charAt(i) == '1') {
                ans += "1";
            } else {
                ans += "9";
            }
        }
        System.out.println(ans);
    }
}
```</s>
