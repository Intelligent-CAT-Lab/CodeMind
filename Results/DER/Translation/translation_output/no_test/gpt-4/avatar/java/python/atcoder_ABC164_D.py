Below is the equivalent code in Python:

```python
def atcoder_ABC164_D():
    S = input()
    N = len(S)
    mod_arr = [0] * N
    mod_cnt = [0] * 2019
    radix = 1
    
    for i in range(N):
        tmp = (int(S[N - 1 - i]) * radix) % 2019
        if i != 0:
            tmp = (tmp + mod_arr[i - 1]) % 2019
        mod_arr[i] = tmp
        mod_cnt[tmp] += 1
        radix = radix * 10 % 2019
    
    ans = 0
    mod_cnt[0] += 1
    
    for count in mod_cnt:
        ans += count * (count - 1) // 2
    
    print(ans)

# Execute the function
atcoder_ABC164_D()
```

A few key differences to note between Java and Python:
- In Python, there is no need to explicitly import `Scanner`. Input is read using the `input()` function.
- There is no `main` method in Python; instead, you can define a function and call it.
- Python uses indentation for code blocks instead of braces `{}`.
- The `System.out.println()` function in Java is akin to the `print()` function in Python.
- Python does not use semicolons to terminate lines.
- Python's `//` operator is used for integer division, which replaces `/ 2` (which would result in float division in Python).
- For-loops use `range()` in Python instead of an explicit initialization, condition, and increment.
