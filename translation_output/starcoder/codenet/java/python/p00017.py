<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```:
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

python code:<fim_suffix><fim_middle>
```python
import java.util.Scanner;
import java.util.Stack;

class p00017:

    def compute(self):
        sc = Scanner(System.in)
        sc.useDelimiter("[\n]+")
        while sc.hasNext():
            S = sc.next()
            for i in range(26):
                converted = ""
                for j in range(len(S)):
                    c = S.charAt(j)
                    if c >= 'a' and c <= 'z':
                        converted += (char) (c + i <= 'z'? c + i : c + i - 26)
                    else:
                        converted += (char) c
                if converted.contains("the") or converted.contains("this") or converted.contains("that"):
                    print converted
                    break

p00017().compute()
```
"""
<|endoftext|>
