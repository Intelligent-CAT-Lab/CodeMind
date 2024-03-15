
```
s = input()
a = [0] * 26
b = [0] * 1111
for i in range(len(s)):
    a[ord(s[i]) - ord('a')] += 1
for i in range(26):
    b[a[i]] += 1
for i in range(999, -1, -2):
    if b[i] > 0:
        b[i] -= 1
        break
m = 0
for i in range(1, 1000, 2):
    m += b[i]
if m % 2 == 0:
    print(m // 2)
else:
    print(m // 2 + 1)
```


```

python code:
```
n = int(input())
a = [0] * n
for i in range(n):
    a[i] = int(input())
a.sort()
print(a[n // 2])
```
/2019-09-15/README.md
# 2019-09-15

## 1. [p01915](https://ac.2333.moe/problem/1915)

```

```

python code:
```

```

## 2. [p01916](https://ac.2333.moe/problem/1916)

```

```

python code:
```

```

## 3. [p01917](https://ac.2333.moe/problem/1917)

```

```

python code:
```

```

## 4. [p01918](https://ac.2333.moe/problem/1918)

```

```

python code:
```

```

## 5. [p01919](https://ac.2333.moe/problem/1919)

```

```

python code:
```

```

## 6. [p01920](https://ac.2333.moe/problem/1920)

```

```

python code:
```

```

## 7. [p01921](https://ac.2333.moe/problem/1921)

```

```

python code:
```

```

## 8. [p01922](https://ac.2333.moe/problem/1922)

```

```

python code:
```

```

## 9. [p01923](https://ac.2333.moe/problem/1923)

```

```

python code:
```

```

## 10. [p01924](https://ac.2333.moe/problem/1924)

```

```

python code:
```

```

## 11. [p01925](https://ac.2333.moe/problem/1925)

```

```

python code:
```

```

## 12. [p01926](https://ac.2333.moe/problem/1926)

```

```

python code:
```

```

## 13. [p01927](https://ac.2333.moe/problem/1927)

```

```

python code:
```

```

## 14. [p01928](https://ac.2333.moe/problem/1928)

```

```

python code:
```

```

## 15. [p01929](https://ac.2333.moe/problem/1929)

```

```

python code:
```

```

## 16. [p01930](https://ac.2333.moe/problem/1930)

```

```

python code:
```

```

## 17. [p01931](https://ac.2333.moe/problem/1931)

```

```

python code:
```

```

## 18. [p01932](https://ac.2333.moe/problem/1932)

```

```

python code:
```

```

## 19. [p01933](https://ac.2333.moe/problem/1933)

```

```

python code:
```

```

## 20. [p01934](https://ac.2333.moe/problem/1934)

```

```

python code:
```

```
