<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
# -*- coding: utf-8 -*-

L = int(input())
hen = L/3
print(hen**3)

```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int hen = L/3;
        System.out.println(hen*hen*hen);
    }
}
```

'''
<|endoftext|>
