<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
8.3

Expected output:
8


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
[/INST]

Here is the Python code that translates the Java code:
```python
import sys

def main():
    if sys.getproperty("ONLINE_JUDGE") is None:
        input_file = open("/home/changshu/CodeMind/dataset/Avatar/Avatar-java/codeforces_99_A/input.txt", "r")
        output_file = open("/home/changshu/CodeMind/dataset/Avatar/Avatar-java/codeforces_99_A/output.txt", "w")
    else:
        input_file = sys.stdin
        output_file = sys.stdout

    tests = 1
    while tests > 0:
        solve()
        tests -= 1

    output_file.flush()
    output_file.close()
    input_file.close()

def solve():
    str = input_file.readline()
    index = str.find(".")
    if index == -1:
        output_file.write(str)
        return

    d = ord(str[index + 1]) - ord("0")
    i = ord(str[index - 1]) - ord("0")

    if i == 9:
        output_file.write("GOTO â Vasilisa.")
        return

    if d >= 5:
        output_file.write(str[0:index - 1] + str(i + 1))
    else:
        output_file.write(str[0:index])

    output_file.write("\n")

if __name__ == "__main__":
    main()
```
Note that the Python code uses the `ord()` function to get the ASCII value of the characters in the input string, and the `str.find()` method to find the index of the decimal point. The `str.substring()` method is used to extract the substring before and after the decimal point. The `str.write()` method is used to write the output to the output file.</s>
