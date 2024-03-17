<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
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
[/INST]
```python
def compute():
    sc = input()
    sc = sc.split('\n')
    for s in sc:
        converted = ""
        for c in s:
            if c >= 'a' and c <= 'z':
                converted += chr((ord(c) + i) % 26 + ord('a'))
            else:
                converted += chr(ord(c))
        if 'the' in converted or 'this' in converted or 'that' in converted:
            print(converted)
            break


if __name__ == '__main__':
    compute()
```</s>
