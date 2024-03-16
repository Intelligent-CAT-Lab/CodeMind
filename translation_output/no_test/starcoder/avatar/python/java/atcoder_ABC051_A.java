<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
print ( input ( ). replace ( ", ", " â " ) )


```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.replace(", ", " â ");
        System.out.println(s);
    }
}
```
<|endoftext|>
