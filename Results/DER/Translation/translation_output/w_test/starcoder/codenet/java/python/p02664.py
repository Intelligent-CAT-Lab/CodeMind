<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
PD?D??P

Expected output:
PDPDPDP


```
import java.util.Scanner;

public class p02664 {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        char[] c = sc.next().toCharArray();
        int count = 0;
        for (int i = 0 ; i < c.length ; i++) {
            if (c[i] == 'D' ||c[i]  ==  '?') {
                count++;
                c[i] = 'D';
            }
            System.out.print(c[i]);
        }
        System.out.print("\n");

    }

}
```

python code:<fim_suffix><fim_middle>

```python
import sys

def main():
    s = sys.stdin.readline().strip()
    count = 0
    for i in range(len(s)):
        if s[i] == 'D' or s[i] == '?':
            count += 1
            s = s[:i] + 'D' + s[i+1:]
    print(s)

if __name__ == '__main__':
    main()
```
<|endoftext|>
