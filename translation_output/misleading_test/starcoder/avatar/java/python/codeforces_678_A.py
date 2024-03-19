<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
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

python code:<fim_suffix><fim_middle>

```python
n, k = map(int, input().split())
print((n // k + 1) * k)
```
"""
<|endoftext|>
