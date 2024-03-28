<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
pnxnn,muduhzn,aquud

Expected output:
pnxnn muduhzn aquud


```
print ( input ( ). replace ( ", ", " â " ) )


```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s.replace(", ", " â "));
    }
}
```
<|endoftext|>
