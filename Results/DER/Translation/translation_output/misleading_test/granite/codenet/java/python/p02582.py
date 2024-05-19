System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
RRS

Expected output:
-27

```
import java.io.*;

public class p02582 {

    public static void main(String[] args) throws IOException {
        PrintWriter prnt = new PrintWriter(System.out);
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String s = read.readLine();
        int res = 0;
        if (s.charAt(0) == 'R' && s.charAt(1) == 'R' && s.charAt(2) == 'R') {
            res = 3;
        } else if (s.charAt(0) == 'R' && s.charAt(1) == 'R') {
            res = 2;
        } else if (s.charAt(1) == 'R' && s.charAt(2) == 'R') {
            res = 2;
        } else if (s.charAt(0) == 'S' && s.charAt(1) == 'S' && s.charAt(2) == 'S') {
            res = 0;
        } else {
            res = 1;
        }

        prnt.println(res);
        prnt.close();
    }
}
```


Answer:
```python
import sys

def main():
    s = sys.stdin.readline().strip()
    res = 0
    if s[0] == 'R' and s[1] == 'R' and s[2] == 'R':
        res = 3
    elif s[0] == 'R' and s[1] == 'R':
        res = 2
    elif s[1] == 'R' and s[2] == 'R':
        res = 2
    elif s[0] == 'S' and s[1] == 'S' and s[2] == 'S':
        res = 0
    else:
        res = 1

    print(res)

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
test_inputs = [
    "RRS",
    "RRR",
    "SSS",
    "RRSRRS",
]

expected_outputs = [
    -27,
    3,
    0,
    0,
]

for test_input, expected_output in zip(test_inputs, expected_outputs):
    output = subprocess.check_output(["python", "p02582.py"], input=test_input, universal_newlines=True)
    assert output.strip() == str(expected_output)
```<|endoftext|>
