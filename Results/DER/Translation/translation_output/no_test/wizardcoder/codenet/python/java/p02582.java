Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
import sys


def solve():
    readline = sys.stdin.buffer.readline
    mod = 10 ** 9 + 7
    s = str(readline().rstrip().decode('utf-8'))
    if s == "RRR":
        print(3)
    elif s == "RRS" or s == "SRR":
        print(2)
    elif s.count("R") == 0:
        print(0)
    else:
        print(1)


if __name__ == '__main__':
    solve()

```

### Response:
```java
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine().trim();
        int mod = (int) Math.pow(10, 9) + 7;
        if (s.equals("RRR")) {
            bw.write("3");
        } else if (s.equals("RRS") || s.equals("SRR")) {
            bw.write("2");
        } else if (s.replaceAll("R", "").equals("")) {
            bw.write("0");
        } else {
            bw.write("1");
        }
        bw.close();
    }
}
```<|endoftext|>
