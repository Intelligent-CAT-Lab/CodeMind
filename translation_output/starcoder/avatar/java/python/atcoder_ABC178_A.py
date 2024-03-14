<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```:
```
public class atcoder_ABC178_A {
    public static void main(String[] args) {
        int x = new java.util.Scanner(System.in).nextInt();
        if (x == 0) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
```

python code:<fim_suffix><fim_middle>
```python
x = int(input())
if x == 0:
    print(1)
else:
    print(0)
```
"""

import sys

def main():
    input = sys.stdin.readline
    x = int(input())
    if x == 0:
        print(1)
    else:
        print(0)

if __name__ == '__main__':
    main()
<|endoftext|>
