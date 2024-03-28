<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
999999999 1

Expected output:
1000000000


```
public class codeforces_678_A {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        
        System.out.println((n / k + 1) * k);
    }
}
```

### Response:
```python
def codeforces_678_A():
    n, k = map(int, input().split())
    print((n // k + 1) * k)

codeforces_678_A()
```
<|EOT|>
