<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1222

Expected output:
-54

```
N = raw_input()
print len([i for i in N if i == '2'])

```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        System.out.println(N.replaceAll("2", "").length());
    }
}
```

'''
<|endoftext|>
