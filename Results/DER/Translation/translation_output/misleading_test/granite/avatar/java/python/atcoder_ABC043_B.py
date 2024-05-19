System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
0000000000

Expected output:
78

```
import java.util.*;

public class atcoder_ABC043_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        while (s.contains("0B ") || s.contains("1B ")) {
            s = s.replaceAll("0B ", "");
            s = s.replaceAll("1B ", "");
        }
        
        s = s.replaceAll(" B ", "");
        
        System.out.println(s);
    }
}
```


Answer:
```python
import re

def translate_java_to_python(s):
    s = re.sub(r'0B |1B ', '', s)
    s = re.sub(r' B ', '', s)
    return s

test_input = "0000000000"
expected_output = "78"

assert translate_java_to_python(test_input) == expected_output
```<|endoftext|>
