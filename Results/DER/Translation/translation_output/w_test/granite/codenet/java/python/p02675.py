System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
16

Expected output:
pon


```
import java.util.*;
import java.lang.*;
import java.io.*;

public class p02675 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        switch(N%10){
            case 2:
            case 4:
            case 5:
            case 7:
            case 9:
              System.out.println("hon");
              break;
            case 0:
            case 1:
            case 6:
            case 8:
              System.out.println("pon");
              break;
            case 3:
              System.out.println("bon");
              break;
        }
    }
}

```


Answer:
```python
import sys

def main():
    N = int(sys.stdin.read())

    switcher = {
        2: "hon",
        4: "hon",
        5: "hon",
        7: "hon",
        9: "hon",
        0: "pon",
        1: "pon",
        6: "pon",
        8: "pon",
        3: "bon"
    }

    print(switcher.get(N % 10, "Invalid input"))

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
test_data = [
    (16, "pon"),
    (22, "hon"),
    (33, "bon"),
    (44, "hon"),
    (55, "hon"),
    (66, "pon"),
    (77, "hon"),
    (88, "pon"),
    (99, "hon"),
    (0, "pon"),
    (1, "pon"),
    (6, "pon"),
    (8, "pon"),
    (3, "bon")
]

for input_val, expected_output in test_data:
    sys.stdin = io.StringIO(str(input_val))
    main()
    assert sys.stdout.getvalue().strip() == expected_output
```<|endoftext|>
