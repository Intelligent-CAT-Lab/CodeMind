<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
string = input()
if string == "ARC":
  print("ABC")
else:
  print("ARC")
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if (s.equals("ARC")) {
            System.out.println("ABC");
        } else {
            System.out.println("ARC");
        }
    }
}
```

'''
<|endoftext|>
