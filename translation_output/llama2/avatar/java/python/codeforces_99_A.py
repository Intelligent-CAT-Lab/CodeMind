<s> Translate the following java code to python and enclose your solution inside ```python```:
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

### 题目

Vasilisa is a programmer. She is working on a new project. She has a task to write a program that will read a string and print it with the following changes:

- If the string contains a digit, then print the string with the digit replaced by the next digit in the alphabet.
- If the string contains a dot, then print the string with the dot replaced by the next digit in the alphabet.

For example, the string "1.2" should be printed as "2".

### 输入

The first line contains a single integer $T$ ($1 \leq T \leq 100$) — the number of test cases.

Each of the next $T$ lines contains a string $S$ ($1 \leq |S| \leq 10^5$) — the string to be processed.

### 输出

For each test case, print the string $S$ with the required changes.

### 样例输入

```
1
1.2
```

### 样例输出

```
2
```

### 题解

```python
import sys

def main():
    tests = int(sys.stdin.readline())
    for _ in range(tests):
        s = sys.stdin.readline()
        if s.find('.') == -1:
            print(s)
        else:
            d = int(s[s.find('.') + 1])
            i = int(s[s.find('.') - 1])
            if d >= 5:
                print(s[:s.find('.')] + str(i + 1))
            else:
                print(s[:s.find('.')])

if __name__ == '__main__':
    main()
```

### 思路

1. 读取输入
2. 循环输出

### 复杂度分析

- 时间复杂度：$O(T)$
- 空间复杂度：$O(1)$
</s>
