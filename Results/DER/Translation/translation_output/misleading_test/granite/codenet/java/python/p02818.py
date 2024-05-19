System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 3 3

Expected output:
0 2 44

```
import java.io.*;
import java.util.*;

public class p02818{
    static public void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //String[] buf = reader.readLine().split(" ");
        long A = sc.nextLong(), B = sc.nextLong(), K = sc.nextLong();
        if(K<=A){
            A -= K;
        } else if(K <= A+B){
            B -= K-A;
            A = 0;
        } else {
            A = 0; B = 0;
        }
        System.out.println(A+" "+B);
    }
}


```


Answer:
```python
import sys

def main():
    A, B, K = map(int, sys.stdin.readline().split())
    if K <= A:
        A -= K
    elif K <= A + B:
        B -= K - A
        A = 0
    else:
        A = 0
        B = 0
    print(A, B)

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
test_inputs = [
    "2 3 3",
    "100 100 10000000000000000",
    "100000000000000000 100000000000000000 100000000000000000",
]

expected_outputs = [
    "0 2 44",
    "0 0 0",
    "0 0 0",
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
