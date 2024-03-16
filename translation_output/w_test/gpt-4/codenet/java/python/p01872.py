Here is the translated Python code for the provided Java code:

```python
def solve(s):
    if s[-1] == '?':
        sum_ = 0
        for i in range(len(s) - 1):
            n = 11 - i
            q = n + 1 if 1 <= n <= 6 else n - 5
            p = int(s[i])
            sum_ += q * p
        sum_ %= 11
        sum_ = 0 if sum_ <= 1 else 11 - sum_
        print(sum_)
    else:
        check = int(s[-1])
        cnt = 0
        ans = 0
        for j in range(10):
            sum_ = 0
            for i in range(len(s) - 1):
                n = 11 - i
                q = n + 1 if 1 <= n <= 6 else n - 5
                p = j if s[i] == '?' else int(s[i])
                sum_ += q * p
            sum_ %= 11
            sum_ = 0 if sum_ <= 1 else 11 - sum_
            if check == sum_:
                cnt += 1
                ans = j
        if cnt == 1:
            print(ans)
        else:
            print("MULTIPLE")

# Sample Test
input_data = "?12345678901"
solve(input_data)
```

Please note that the original Java code reads the input from `System.in`, which does not have a direct Python equivalent. For this translation, I've replaced it with a function `solve(s)` that takes the input string as an argument. You can run the sample test by executing the function with the given test input.
