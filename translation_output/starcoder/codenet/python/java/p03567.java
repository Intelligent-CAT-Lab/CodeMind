<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
S = input()
if S.count("AC") >= 1:
  print("Yes")
else:
  print("No")

```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        if (S.contains("AC")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```
<|endoftext|>
