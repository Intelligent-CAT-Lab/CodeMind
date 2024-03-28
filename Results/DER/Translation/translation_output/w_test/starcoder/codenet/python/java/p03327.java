<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
999

Expected output:
ABC


```
# -*- coding:utf-8 -*-
if __name__ == "__main__":
    n = int(input())
    if n < 1000:
        print("ABC")
    else:
        print("ABD")
```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n < 1000) {
            System.out.println("ABC");
        } else {
            System.out.println("ABD");
        }
    }
}
```

'''
<|endoftext|>
