<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
print ( chr ( ord ( input ( ) ) + 1 ) )


```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println((char)(sc.next().charAt(0) + 1));
    }
}
```
<|endoftext|>
