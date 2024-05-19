System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
0 2 3 4 5

Expected output:
-77

```
import java.util.*;

public class p02639 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] x = new int[5];
        int sum=0;
        for(int i=0;i<5;i++){
            x[i] = sc.nextInt();
            sum += x[i];
        }
        System.out.println(15-sum);
    }

}

```


Answer:
```python
import sys

def main():
    x = list(map(int, sys.stdin.readline().split()))
    sum_x = sum(x)
    print(15 - sum_x)

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
test_input = "0 2 3 4 5"
expected_output = -77

sys.stdin = io.StringIO(test_input)
output = io.StringIO()
sys.stdout = output

main()

actual_output = output.getvalue().strip()
assert actual_output == str(expected_output)
```<|endoftext|>
