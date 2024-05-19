System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5 2

Expected output:
18


```
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class p02994 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int l = scanner.nextInt();

        List<Integer> diff = new ArrayList<Integer>();
        
        for(int i = 1; i < n+1; i++) {
          int value = l+i-1;
          if(value < 0) {
            value = value * -1;
          }
          diff.add(value);
          }
        
        Integer removeK = diff.indexOf(Collections.min(diff)) + 1;
        
        
        System.out.println(n*l + n*(n+1)/2 - n - (l+ removeK -1));
    }
}
```


Answer:
```python
import sys

def main():
    n, l = map(int, sys.stdin.readline().split())
    diff = [l+i-1 if l+i-1 >= 0 else -(l+i-1) for i in range(1, n+1)]
    remove_k = diff.index(min(diff)) + 1
    print(n*l + n*(n+1)//2 - n - (l+remove_k-1))

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
test_inputs = [
    ("5 2", 18),
]
for test_input, expected_output in test_inputs:
    sys.stdin = open("input.txt", "w")
    sys.stdout = open("output.txt", "w")
    sys.stdin.write(test_input)
    sys.stdin.seek(0)
    main()
    sys.stdout.seek(0)
    actual_output = sys.stdout.read().strip()
    assert actual_output == str(expected_output)
```<|endoftext|>
