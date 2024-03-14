<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
s = raw_input()
print 'x' if s[0]=='x' and s[-1]=='x' else 'o'
```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(s.charAt(0)=='x' && s.charAt(s.length()-1)=='x')
            System.out.println("x");
        else
            System.out.println("o");
    }
}
```
<|endoftext|>
