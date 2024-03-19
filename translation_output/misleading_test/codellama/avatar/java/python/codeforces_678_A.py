<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
999999999 1

Expected output:
1000000087

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
[/INST]
```python
n = int(input())
k = int(input())

print((n // k + 1) * k)
```
Explanation:

* `n // k` is the integer division of `n` by `k`, which returns the integer part of the result.
* `+ 1` is added to the result to get the next multiple of `k` greater than `n`.
* The result is then multiplied by `k` to get the final answer.

Note: In Python 3, the `//` operator is used for integer division, while in Python 2, the `/` operator is used.</s>
