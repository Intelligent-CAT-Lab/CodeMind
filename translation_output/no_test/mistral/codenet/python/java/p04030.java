<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
s = input()
a = ""
for i in s:
  if i == "B":
    if not(a == ""):
      a = a[:-1]
  else:
    a += i
print(a)
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String a = "";
        for (char c : s.toCharArray()) {
            if (c == 'B') {
                if (!a.isEmpty()) {
                    a = a.substring(0, a.length() - 1);
                }
            } else {
                a += c;
            }
        }
        System.out.println(a);
    }
}
```</s>
