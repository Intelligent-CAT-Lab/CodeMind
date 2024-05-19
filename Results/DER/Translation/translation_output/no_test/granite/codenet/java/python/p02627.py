System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p02627{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(str.matches("[A-Z]")? "A" : "a");
    }
}
```


Answer:
```python
import re

str = input()
print("A" if re.match(r"[A-Z]", str) else "a")
```<|endoftext|>
