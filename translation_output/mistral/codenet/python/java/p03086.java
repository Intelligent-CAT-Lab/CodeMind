<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
# é¨åæå­åã®ãã¡ãacgtã®ã¿ãããªããã®ã®æå¤§é·
# åé ­ããæ¢ç´¢ãã¦ãacgtãªãé·ãã+1ãã
ans = 0
length = 0
s = input()
for i in s:
  if i in ["A","C","G","T"]:
    length += 1
    ans = max(ans,length)
  else:
    length = 0
print(ans)
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int ans = 0;
        int length = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'A' || c == 'C' || c == 'G' || c == 'T') {
                length++;
                ans = Math.max(ans, length);
            } else {
                length = 0;
            }
        }
        System.out.println(ans);
    }
}
```</s>
