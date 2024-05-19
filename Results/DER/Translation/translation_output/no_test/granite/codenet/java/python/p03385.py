System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p03385 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        char s[] = sc.next().toCharArray();
        boolean abc[] = new boolean[3];
        for(int i = 0; i < 3; i++) {
            if( s[i] == 'a' ) abc[0] = true;
            if( s[i] == 'b' ) abc[1] = true;
            if( s[i] == 'c' ) abc[2] = true;
        }
        
        boolean isOK = true;
        for(int i = 0; i < 3; i++) {
            isOK &= abc[i];
        }
        
        System.out.println( (isOK)? "Yes" : "No" );
    }
}

```


Answer:
```python
import sys

s = input()
abc = [False] * 3
for i in range(3):
    if s[i] == 'a':
        abc[0] = True
    if s[i] == 'b':
        abc[1] = True
    if s[i] == 'c':
        abc[2] = True

isOK = True
for i in range(3):
    isOK &= abc[i]

print("Yes" if isOK else "No")
```<|endoftext|>
