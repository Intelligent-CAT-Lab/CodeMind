<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
xlmw mw xli tmgxyvi xlex m xsso mr xli xvmt.

Expected output:
is the picture that i took in the trip.

```
import java.util.Scanner;
import java.util.Stack;

class p00017 {

    public static void main(String[] args) {
        new p00017().compute();
    }

    void compute() {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("[\n]+");
        while (sc.hasNext()) {
            String S = sc.next();
            for (int i = 0; i < 26; i++) {
                String converted = "";
                for (int j = 0; j < S.length(); j++) {
                    char c = S.charAt(j);
                    if (c >= 'a' && c <= 'z') {
                        converted += (char) (c + i <= 'z' ? c + i : c + i - 26);
                    } else {
                        converted += (char) c;
                    }
                }
                if (converted.contains("the") || converted.contains("this") || converted.contains("that")) {
                    System.out.println(converted);
                    break;
                }
            }
        }
    }
}

```
[/INST]
```python
import re

def compute():
    with open('input.txt', 'r') as f:
        for line in f:
            line = line.strip()
            for i in range(26):
                converted = ""
                for char in line:
                    if char.isalpha():
                        if char.islower() and char + i <= 'z':
                            converted += chr(ord(char) + i)
                        else:
                            converted += chr(ord(char) + i - 26)
                    else:
                        converted += char
                if 'the' in converted or 'this' in converted or 'that' in converted:
                    print(converted)
                    break

compute()
```</s>
