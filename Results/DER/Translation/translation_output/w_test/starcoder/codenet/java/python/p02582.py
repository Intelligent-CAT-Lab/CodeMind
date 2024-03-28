<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
RRS

Expected output:
2


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

python code:<fim_suffix><fim_middle>

```python
import sys

s = sys.stdin.readline().strip()

if s[0] == 'R' and s[1] == 'R' and s[2] == 'R':
    print(3)
elif s[0] == 'R' and s[1] == 'R':
    print(2)
elif s[1] == 'R' and s[2] == 'R':
    print(2)
elif s[0] == 'S' and s[1] == 'S' and s[2] == 'S':
    print(0)
else:
    print(1)
```
<|endoftext|>
