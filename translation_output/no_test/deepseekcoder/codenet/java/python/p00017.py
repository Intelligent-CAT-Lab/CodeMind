<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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
import sys

class p00017:

    @staticmethod
    def main():
        p00017().compute()

    def compute(self):
        for line in sys.stdin:
            for i in range(26):
                converted = ""
                for j in range(len(line)):
                    c = line[j]
                    if 'a' <= c <= 'z':
                        converted += chr(ord(c) + i) if ord(c) + i <= ord('z') else chr(ord(c) + i - 26)
                    else:
                        converted += c
                if "the" in converted or "this" in converted or "that" in converted:
                    print(converted)
                    break

if __name__ == "__main__":
    p00017.main()
```

This Python code does the same thing as the Java code. It reads lines from the standard input, converts each character in the line by shifting it by a number of positions (from 0 to 25), and checks if the converted string contains "the", "this", or "that". If it does, it prints the converted string and breaks the loop.
<|EOT|>
