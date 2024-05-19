System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
0

Expected output:
0 0


```
import java.util.*;

public class p02111 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int minute = 12 * 60 * n / 360;
        System.out.println((minute / 60) + " " + (minute % 60));
    }
}

```


Answer:
```python
import math

def main():
    n = int(input())
    minute = int(math.floor(12 * 60 * n / 360))
    print(minute // 60, minute % 60)

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
test_inputs = [
    0,
    1,
    2,
    3,
    4,
    5,
    6,
    7,
    8,
    9,
    10,
    11,
    12,
    13,
    14,
    15,
    16,
    17,
    18,
    19,
    20,
    21,
    22,
    23,
]

expected_outputs = [
    "0 0",
    "0 12",
    "0 24",
    "0 36",
    "0 48",
    "1 0",
    "1 12",
    "1 24",
    "1 36",
    "1 48",
    "2 0",
    "2 12",
    "2 24",
    "2 36",
    "2 48",
    "3 0",
    "3 12",
    "3 24",
    "3 36",
    "3 48",
    "4 0",
    "4 12",
    "4 24",
    "4 36",
    "4 48",
    "5 0",
    "5 12",
    "5 24",
    "5 36",
    "5 48",
    "6 0",
    "6 12",
    "6 24",
    "6 36",
    "6 48",
    "7 0",
    "7 12",
    "7 24",
    "7 36",
    "7 48",
    "8 0",
    "8 12",
    "8 24",
    "8 36",
    "8 48",
    "9 0",
    "9 12",
    "9 24",
    "9 36",
    "9 48",
    "10 0",
    "10 12",
    "10 24",
    "10 36",
    "10 48",
    "11 0",
    "11 12",
    "11 24",
    "11 36",
    "11 48",
]

for i, test_input in enumerate(test_inputs):
    actual_output = str(main(test_input))
    expected_output = expected_outputs[i]
    assert actual_output == expected_output, f"Test failed for input {test_input}"

print("All tests passed!")
```<|endoftext|>
