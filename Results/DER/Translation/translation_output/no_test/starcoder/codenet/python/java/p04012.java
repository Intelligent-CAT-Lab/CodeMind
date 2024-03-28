<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
# coding = SJIS
Alfa = "abcdefghijklmnopqrstuvwxyz"
w = str(input())
for i in Alfa:
    if w.count(i) % 2 == 1:
        print("No")
        exit()
print("Yes")
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String alfa = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < alfa.length(); i++) {
            if (s.indexOf(alfa.charAt(i)) % 2 == 1) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
```
<|endoftext|>
