System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
0

Expected output:
0


```
import java.util.Scanner;

public class atcoder_ABC120_C {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char[] s1 = sc.next().toCharArray();
        int ans = 0;
        int c1 = 0;
        int c0 = 0;
        
        for (int i = 0; i < s1.length; i++) {
            if (s1[i] == '1') {
                if (c0 > 0) {
                    c0--;
                    ans++;
                } else {
                    c1++;
                }
            } else {
                if (c1 > 0) {
                    c1--;
                    ans++;
                } else {
                    c0++;
                }
            }
        }
        
        System.out.println(ans * 2);
    }
}
```


Answer:
```python
import sys

def main():
    s1 = sys.stdin.readline().strip()
    ans = 0
    c1 = 0
    c0 = 0
    
    for i in range(len(s1)):
        if s1[i] == '1':
            if c0 > 0:
                c0 -= 1
                ans += 1
            else:
                c1 += 1
        else:
            if c1 > 0:
                c1 -= 1
                ans += 1
            else:
                c0 += 1
    
    print(ans * 2)

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
test_inputs = [
    "0",
    "1010",
    "11001",
]

expected_outputs = [
    "0",
    "2",
    "6",
]

for test_input, expected_output in zip(test_inputs, expected_outputs):
    sys.stdin = open("input.txt", "w")
    sys.stdout = open("output.txt", "w")
    sys.stdin.write(test_input + "\n")
    main()
    sys.stdin.close()
    sys.stdout.close()
    
    with open("output.txt", "r") as output_file:
        actual_output = output_file.read().strip()
    
    assert actual_output == expected_output, f"Expected output: {expected_output}, Actual output: {actual_output}"
```<|endoftext|>
