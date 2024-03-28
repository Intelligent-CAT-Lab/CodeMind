<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
B

Expected output:
A


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

python code:<fim_suffix><fim_middle>

```python
import sys

str = sys.stdin.readline().strip()
print("A" if str.isupper() else "a")
```
"""
<|endoftext|>
