System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4 4

Expected output:
5


```

import java.util.Scanner;

class p00356 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int p = 0;
        int a;
        int b;
        int z;
        int m;
        a = x;
        b = y;
        while (x % y!= 0) {
            z = x;
            x = y;
            y = z % y;
        }
        m = a + b - y;

        if (a % 2 == 0 || b % 2 == 0 || a == b || a % 2 > 0 && b % 2 > 0) {
            System.out.println(m + 1);
        } else {
            System.out.println(m);
        }

    }
}


```


Answer:
```python
import math

def main():
    x, y = map(int, input().split())
    gcd = math.gcd(x, y)
    lcm = x * y // gcd
    if x % 2 == 0 or y % 2 == 0 or x == y or (x % 2 > 0 and y % 2 > 0):
        print(lcm // gcd + 1)
    else:
        print(lcm // gcd)

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
test_inputs = [
    ("4 4", 5),
    ("1 1", 2),
    ("2 3", 5),
    ("10 15", 30),
    ("100 200", 200),
]
for input, expected_output in test_inputs:
    with patch("builtins.input", return_value=input):
        main()
        captured = capsys.readouterr()
        assert captured.out == str(expected_output) + "\n"
```<|endoftext|>
