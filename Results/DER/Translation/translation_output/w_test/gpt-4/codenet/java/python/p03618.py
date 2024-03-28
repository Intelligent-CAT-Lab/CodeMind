Here is the Java code translated to Python:

```python
def count_substring_patterns(s):
    cnt = [0] * 26
    for char in s:
        cnt[ord(char) - ord('a')] += 1
    
    N = len(s)
    ans = (N * (N + 1) // 2) + 1
    for count in cnt:
        if count > 0:
            ans -= (count * (count + 1) // 2)
    
    return ans

# Test case
input_string = "aatt"
print(count_substring_patterns(input_string))
```

This Python function takes a string `s` as input and prints the calculated answer, which is the expected output.
