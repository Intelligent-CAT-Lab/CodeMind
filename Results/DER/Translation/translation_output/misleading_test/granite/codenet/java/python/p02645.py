System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
takahashi

Expected output:
taXk

```
import java.util.*;
 
public class p02645 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        
        System.out.println(s.substring(0,3));
   }
}

```


Answer:
```python
s = input()
print(s[:3])
```

Test input:
```
takahashi
```

Expected output:
```
taXk
```<|endoftext|>
