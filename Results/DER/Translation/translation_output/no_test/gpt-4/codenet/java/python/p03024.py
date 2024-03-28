Here's the equivalent Python code for the given Java code:

```python
res = input()
day = len(res)
nday = 15 - day
cnt = res.count('o')

if day <= 7 or (day >= 8 and (cnt + nday) >= 8):
    print("YES")
else:
    print("NO")
```

This Python code reads the string, calculates the day based on string length, calculates the remaining days (`nday`), and counts the occurrences of 'o'. It then prints "YES" or "NO" based on the condition provided in the original Java code.
