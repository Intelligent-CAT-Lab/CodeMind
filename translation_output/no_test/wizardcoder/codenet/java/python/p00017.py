Below is an instruction that describes a task. Write a response that appropriately completes the request.

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
                        converted += (char) (c + i <= 'z'? c + i : c + i - 26);
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
import java.util.Scanner
import java.util.Stack

class p00017:

    def __init__(self):
        self.sc = Scanner(System.in)
        self.sc.useDelimiter("[\n]+")

    def compute(self):
        while self.sc.hasNext():
            S = self.sc.next()
            for i in range(26):
                converted = ""
                for j in range(len(S)):
                    c = S[j]
                    if c >= 'a' and c <= 'z':
                        converted += chr(ord(c) + i if ord(c) + i <= ord('z') else ord(c) + i - 26)
                    else:
                        converted += c
                if "the" in converted or "this" in converted or "that" in converted:
                    print(converted)
                    break

    def main(self):
        self.compute()

p00017().main()
```<|endoftext|>
