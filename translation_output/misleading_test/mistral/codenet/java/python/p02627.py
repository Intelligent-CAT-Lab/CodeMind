<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
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
        System.out.println(str.matches("[A-Z]") ? "A" : "a");
    }
}
```
[/INST]
```python
str = input()
if str.isalpha():
    print("A")
else:
    print("a")
```</s>
