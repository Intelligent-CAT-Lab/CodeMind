Here is the Python equivalent of the provided Java code:

```python
def calculate_substring_count(s):
    N = len(s)
    cnt = [0] * 26
    for char in s:
        cnt[ord(char) - ord('a')] += 1
    
    ans = N * (N + 1) // 2 + 1
    for i in range(26):
        if cnt[i] > 0:
            ans -= cnt[i] * (cnt[i] + 1) // 2
    
    return ans

# Test case
print(calculate_substring_count("aatt"))
```
When you run the above code with the test input "aatt", it will output `5` as expected.
