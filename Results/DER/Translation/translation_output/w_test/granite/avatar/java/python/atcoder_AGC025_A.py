System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
9

Expected output:
9


```
import java.util.*;

public class atcoder_AGC025_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.nextLine();

        for (int i = 1; i < n.length(); i++) {
            if (n.charAt(i)!= '0') {
                int sum = 0;
                for (int j = 0; j < n.length(); j++) {
                    sum += n.charAt(j) - '0';
                }
                System.out.println(sum);
                return;
            }
        }

        if (n.charAt(0) == '1') {
            System.out.println(10);
            return;
        }

        System.out.println(n.charAt(0));
    }
}
```


Answer:
```python
n = input()

for i in range(1, len(n)):
    if n[i]!= '0':
        sum = 0
        for j in range(len(n)):
            sum += int(n[j])
        print(sum)
        break
else:
    if n[0] == '1':
        print(10)
    else:
        print(int(n[0]))
```

You can write the following test cases to ensure it works correctly:

```python
test_inputs = [
    "9",
    "10",
    "11",
    "100",
    "1000",
]

expected_outputs = [
    "9",
    "19",
    "20",
    "99",
    "999",
]

for test_input, expected_output in zip(test_inputs, expected_outputs):
    assert atcoder_AGC025_A.main(test_input) == expected_output
```<|endoftext|>
