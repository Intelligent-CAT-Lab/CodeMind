<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 10

Expected output:
-52

```
#!/usr/bin/env python3
# -*- coding: utf-8 -*-



def main():
    N, K = map(int, input().split())
    print(1 if N <= K else 0)

if __name__ == "__main__": main()


```

java code:<fim_suffix><fim_middle>

```java
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int K = in.nextInt();
        System.out.println(1 if N <= K else 0);
    }
}
```

'''
<|endoftext|>
