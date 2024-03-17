<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
ani

Expected output:
square1001


```
print('square1001' if input()=='ani' else 'e869120')


```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(s.equals("ani"))
            System.out.println("square1001");
        else
            System.out.println("e869120");
    }
}
```

'''
<|endoftext|>
