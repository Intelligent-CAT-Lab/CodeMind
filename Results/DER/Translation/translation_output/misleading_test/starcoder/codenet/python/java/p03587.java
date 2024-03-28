<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
111100

Expected output:
102

```
s = input()
print(s.count("1"))

```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(s.length() - s.replace("1", "").length());
    }
}
```

'''
<|endoftext|>
