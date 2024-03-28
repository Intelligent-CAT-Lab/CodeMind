<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
xlmw mw xli tmgxyvi xlex m xsso mr xli xvmt.

Expected output:
this is the picture that i took in the trip.


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

### Response:
```python
def compute():
    import sys
    import string

    def shift_char(c, shift):
        ascii_offset = ord('a')
        return chr((ord(c) - ascii_offset + shift) % 26 + ascii_offset)

    def shift_string(s, shift):
        return ''.join(shift_char(c, shift) if c in string.ascii_lowercase else c for c in s)

    for line in sys.stdin:
        line = line.strip()
        for i in range(26):
            converted = shift_string(line, i)
            if 'the' in converted or 'this' in converted or 'that' in converted:
                print(converted)
                break

compute()
```

This Python code does the same thing as the Java code. It reads lines from the standard input, and for each line, it shifts each character in the line by a number of positions (from 0 to 25) and checks if the shifted string contains "the", "this", or "that". If it does, it prints the shifted string and breaks out of the loop. If it doesn't find a match after shifting all 26 positions, it continues with the next line.
<|EOT|>
