<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
100

Expected output:
-13

```
n = input()
print(max(int(n[0])-1+9*(len(n)-1),sum([int(i) for i in n])))
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        System.out.println(Math.max(Integer.parseInt(n.charAt(0))-1+9*(n.length()-1),
                Integer.parseInt(n)));
    }
}
```
'''
<|endoftext|>
