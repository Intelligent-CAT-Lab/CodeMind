<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
8.3

Expected output:
55

```
import java.util.*;
import java.io.*;
import java.util.stream.*;

public class codeforces_99_A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        if (System.getProperty("ONLINE_JUDGE") == null) {
            File inputFile = new File("/home/changshu/CodeMind/dataset/Avatar/Avatar-java/codeforces_99_A/input.txt");
            File outputFile = new File("/home/changshu/CodeMind/dataset/Avatar/Avatar-java/codeforces_99_A/output.txt");
            br = new BufferedReader(new FileReader(inputFile));
            bw = new BufferedWriter(new FileWriter(outputFile));
        }

        int tests;
        tests = 1;
        while (tests-- > 0) {
            solve();
        }

        bw.flush();
        bw.close();
        br.close();
    }

    static void solve() throws Exception {
        String str = br.readLine();
        int index = str.indexOf(".");
        if (index == -1) {
            bw.write(str);
            return;
        }

        int d = str.charAt(index + 1) - '0';
        int i = str.charAt(index - 1) - '0';

        if (i == 9) {
            bw.write("GOTO â Vasilisa.");
            return;
        }

        if (d >= 5) {
            bw.write(str.substring(0, index - 1) + (i + 1));
        } else {
            bw.write(str.substring(0, index));
        }

        bw.write("\n");
    }
}
```

@@ Response
```python
import sys

def solve():
    str = sys.stdin.readline().strip()
    index = str.find('.')
    if index == -1:
        print(str)
        return

    d = int(str[index + 1])
    i = int(str[index - 1])

    if i == 9:
        print("GOTO â Vasilisa.")
        return

    if d >= 5:
        print(str[:index - 1] + str(i + 1))
    else:
        print(str[:index])

def main():
    tests = 1
    while tests > 0:
        solve()
        tests -= 1

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a floating-point number from the standard input, checks if it's an integer, and if not, increments the integer part by 1. If the integer part is 9, it prints "GOTO â Vasilisa.". Otherwise, it prints the modified number.<｜end▁of▁sentence｜>
