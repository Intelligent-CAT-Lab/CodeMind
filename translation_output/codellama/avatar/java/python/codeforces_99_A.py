<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java Code:

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

Translate the above java code to python.

python Code:

[/INST]
```python
import sys

def solve():
    str = sys.stdin.readline()
    index = str.find(".")
    if index == -1:
        print(str)
        return

    d = ord(str[index + 1]) - ord("0")
    i = ord(str[index - 1]) - ord("0")

    if i == 9:
        print("GOTO â Vasilisa.")
        return

    if d >= 5:
        print(str[:index - 1] + chr(i + 1))
    else:
        print(str[:index])

    print()

if __name__ == "__main__":
    solve()
```
This is the Python code for the given Java code. The `solve()` function is the same as the `solve()` function in the Java code, with a few minor changes to account for the differences in syntax between Python and Java. The `if __name__ == "__main__":` block is used to run the `solve()` function when the script is executed directly, rather than being imported as a module.</s>
