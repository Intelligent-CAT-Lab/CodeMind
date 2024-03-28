<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
68

Expected output:
19


```
x = input()
x = int(x)
y = (x-30)/2
print(int(y))

```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = (x-30)/2;
        System.out.println(y);
    }
}
```

'''
<|endoftext|>
