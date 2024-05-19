System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
```
s = input()
if s[0] == s[-1]:
    if len(s) % 2:
        ans = 'Second'
    else:
        ans = 'First'
else:
    if len(s) % 2:
        ans = 'First'
    else:
        ans = 'Second'
print(ans)
```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String ans = "";
        if (s.charAt(0) == s.charAt(s.length() - 1)) {
            if (s.length() % 2!= 0) {
                ans = "Second";
            } else {
                ans = "First";
            }
        } else {
            if (s.length() % 2!= 0) {
                ans = "First";
            } else {
                ans = "Second";
            }
        }
        System.out.println(ans);
    }
}
```<|endoftext|>
