Below is the provided Java code translated to Python:

```python
T = input()
N = len(T)

one_sum = 0
indexes = []
for i in range(N):
    if T[i] == '1':
        length = 0
        for j in range(i, N):
            if T[j] == '1':
                length += 1
            else:
                break
        if length % 2 == 1:
            indexes.append(i - (one_sum - len(indexes)))
        one_sum += length
        i += length - 1

zero_sum = N - one_sum
ans = (zero_sum + 1) * (one_sum - len(indexes)) // 2

for i, index in enumerate(indexes):
    ans += zero_sum + 1 - (index - i + (1 + i % 2)) // 2

for i in range(one_sum - 1, 0, -1):
    ans += (i + 1) // 2

print(ans)
```

Please note that Python is zero-indexed, as opposed to Java which is one-indexed. I've also switched from using `//` for integer division in Python, where in Java the `/` operator by default does integer division when both operands are integers. Also, Python's `append()` method is used to add elements to the list, similar to Java's `add()` method. `input()` is used for standard input in Python, taking the place of Java's `Scanner` object. Additionally, the `print()` function is used to output the final result, replacing Java's `System.out.println()`.
