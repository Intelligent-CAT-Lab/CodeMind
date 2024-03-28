<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
54 20

Expected output:
2


```
import java.io.*;

class p02256 {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);

        System.out.println(GCD(a, b));
    }

    public static int GCD (int a, int b) {
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (a % b == 0) return b;
        else return GCD (b, a%b);
    }
}
```

python code:<fim_suffix><fim_middle>

```python
import sys

def GCD(a, b):
    if a < b:
        a, b = b, a
    if a % b == 0:
        return b
    else:
        return GCD(b, a % b)

if __name__ == "__main__":
    a, b = map(int, sys.stdin.readline().split())
    print(GCD(a, b))
```
<|endoftext|>
