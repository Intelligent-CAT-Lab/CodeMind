<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
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
import sys

def main():
    for line in sys.stdin:
        line = line.strip()
        for i in range(26):
            converted = ""
            for c in line:
                if c >= 'a' and c <= 'z':
                    converted += chr(ord(c) + i <= ord('z')? ord(c) + i : ord(c) + i - 26)
                else:
                    converted += c
            if converted.find("the")!= -1 or converted.find("this")!= -1 or converted.find("that")!= -1:
                print converted
                break

if __name__ == "__main__":
    main()
```

'''
<|endoftext|>
