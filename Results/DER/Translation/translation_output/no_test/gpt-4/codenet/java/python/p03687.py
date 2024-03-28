```python
def p03687():
    s = input()
    ans = 101
    for i in range(26):
        target = chr(i + ord('a'))
        max_dist = 0
        cur_dist = 0
        for j in range(len(s)):
            if s[j] == target:
                cur_dist = 0
            else:
                cur_dist += 1
                max_dist = max(max_dist, cur_dist)
        ans = min(ans, max_dist)

    print(ans)

# Call the function to execute
p03687()
```
