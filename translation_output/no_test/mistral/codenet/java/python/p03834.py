<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
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

def main():
    try:
        with open(sys.stdin, 'r') as reader:
            s = reader.readline()
            print(s.replace(",", " "))
    except Exception as e:
        print(e)

if __name__ == '__main__':
    main()
```</s>
