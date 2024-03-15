<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
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
```</s>
