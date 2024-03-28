Below is the equivalent Python code for the provided Java code:

```python
def count_substrings(bit_string):
    T = list(bit_string)
    N = len(T)
    
    one_sum = 0
    indexes = []
    i = 0
    while i < N:
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
        i += 1
    
    zero_sum = N - one_sum
    ans = (zero_sum + 1) * (one_sum - len(indexes)) // 2
    
    for i, index in enumerate(indexes):
        ans += zero_sum + 1 - (index - i + (1 + i % 2)) // 2
    
    for i in range(one_sum - 1, 0, -1):
        ans += (i + 1) // 2
    
    return ans

# Sample test case
bit_string = input()
print(count_substrings(bit_string))
```
Please note that integer division in Python 3 is done using `//`, which is equivalent to the division performed in the original Java code since Java truncates the division of two integers.
