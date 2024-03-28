Here is the Python translation of the provided Java code:

```python
def f(a, m):
    if m >= 0:
        return f(a + 3 * 10**m, m - 1) + f(a + 5 * 10**m, m - 1) + f(a + 7 * 10**m, m - 1)
    else:
        s = str(a)
        if '3' in s and '5' in s and '7' in s and a <= N:
            return 1
        else:
            return 0

S = input()
N = int(S)
ans = 0
for i in range(3, len(S)):
    ans += 3**i - 3 * 2**i + 3
    
ans += f(3 * 10**(len(S) - 1), len(S) - 2)
ans += f(5 * 10**(len(S) - 1), len(S) - 2)
ans += f(7 * 10**(len(S) - 1), len(S) - 2)
print(ans)
```

This Python code accepts input for variable `S`, which it uses to compute `N`. It then calculates the answer `ans` using the same logic as the Java code. The `f` function mirrors the recursive behavior of its Java counterpart. Finally, the code prints the result as per the original Java code.
