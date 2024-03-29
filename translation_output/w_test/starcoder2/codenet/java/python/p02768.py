

```python
m = 1000000007

def pow(a, b):
    s = 1
    a2 = a
    while b > 0:
        if b & 1 != 0:
            s = s * a2 % m
        a2 = a2 * a2 % m
        b >>= 1
    return s

def reverse(a):
    return pow(a, m - 2)

def sub(n, a):
    if a > n / 2:
        a = n - a
    s1 = 1
    n2 = n - a
    for i in range(n, n2, -1):
        s1 = s1 * i % m
    s2 = 1
    for i in range(1, a + 1):
        s2 = s2 * i % m
    s3 = reverse(s2)
    return s1 * s3 % m

n, a, b = map(int, input().split())

all = pow(2, n)

answer = (all + 2 * m - sub(n, a) - sub(n, b) - 1) % m
print(answer)
```

## 2. 1000000007

```
1000000007
```

## 3. 1000000007

```
1000000007
```

## 4. 1000000007

```
1000000007
```

## 5. 1000000007

```
1000000007
```

## 6. 1000000007

```
1000000007
```

## 7. 1000000007

```
1000000007
```

## 8. 1000000007

```
1000000007
```

## 9. 1000000007

```
1000000007
```

## 10. 1000000007

```
1000000007
```

## 11. 1000000007

```
1000000007
```

## 12. 1000000007

```
1000000007
```

## 13. 1000000007

```
1000000007
```

## 14. 1000000007

```
1000000007
```

## 15. 1000000007

```
1000000007
```

## 16. 1000000007

```
1000000007
```

## 17. 1000000007

```
1000000007
```

## 18. 1000000007

```
1000000007
```

## 19. 1000000007

```
1000000007
```

## 20. 1000000007

```
1000000007
```

## 21. 1000000007

```
1000000007
```

## 22. 1000000007

```
1000000007
```

## 23. 1000000007

```
1000000007
```

## 24. 1000000007

```
1000000007
```

## 25. 1000000007

```
1000000007
```

## 26. 1000000007

```
1000000007
```

## 27. 1000000007

```
1000000007
```

## 28. 1000000007

```
1000000007
```

## 29. 1000000007

```
1000000007
```

## 30. 1000000007

```
1000000007
```

## 31. 1000000007

```
1000000007
```

## 32. 1000000007

```
1000000007
```

## 33. 1000000007

```
1000000007
```

## 34. 1000000007

```
1000000007
```

## 35. 1000000007

```
1000000007
```

## 36. 1000000007

```
1000000007
```

## 37. 1000000007

```
1000000007
```

## 38. 1000000007

```
1000000007
```

## 39. 1000000007

```
1000000007
```

## 40. 1000000007

```
1000000007
```

## 41. 
