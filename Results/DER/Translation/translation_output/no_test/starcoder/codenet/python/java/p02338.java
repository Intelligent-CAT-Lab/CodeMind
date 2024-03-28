<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
#!/usr/bin/env python3
# -*- coding: utf-8 -*-



def main():
    N, K = map(int, input().split())
    print(1 if N <= K else 0)

if __name__ == "__main__": main()


```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        System.out.println(1 if N <= K else 0);
    }
}
```

'''
<|endoftext|>
