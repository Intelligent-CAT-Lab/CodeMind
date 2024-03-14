<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
s = input()
print(700+100*s.count("o"))
```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(700+100*s.length()-s.replaceAll("o","").length());
    }
}
```
<|endoftext|>
