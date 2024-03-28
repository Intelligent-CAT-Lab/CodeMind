<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
S = input() 
if (S == 'hi' or S == 'hihi' or S == 'hihihi' or S == 'hihihihi' or S == 'hihihihihi'):
  print('Yes')
else:
  print('No')
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if (s.equals("hi") || s.equals("hihi") || s.equals("hihihi") || s.equals("hihihihi") || s.equals("hihihihihi")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```
<|endoftext|>
