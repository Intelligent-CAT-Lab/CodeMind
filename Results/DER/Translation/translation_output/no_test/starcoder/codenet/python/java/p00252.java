<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
B = input()

O = ["1 1 0", "0 0 1"]

if B in O :
    print("Open")
else :
    print("Close")


```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String B = sc.next();
        String[] O = {"1 1 0", "0 0 1"};
        if (Arrays.asList(O).contains(B)) {
            System.out.println("Open");
        } else {
            System.out.println("Close");
        }
    }
}
```

'''
<|endoftext|>
