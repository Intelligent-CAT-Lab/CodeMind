System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```:
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
```<|endoftext|>
