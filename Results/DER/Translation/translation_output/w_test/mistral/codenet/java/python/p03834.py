<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
happy,newyear,enjoy

Expected output:
happy newyear enjoy


```
import java.io.IOException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p03834 {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in))) {
            final String s = reader.readLine();

            System.out.println(s.replace(",", " "));
        }
    }
}

```
[/INST]
```python
import sys

input = sys.stdin

input_str = input.readline()

print(input_str.replace(",", " "))
```</s>
