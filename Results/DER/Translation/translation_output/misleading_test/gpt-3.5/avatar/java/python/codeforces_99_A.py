```python
import sys

def solve(str_num):
    index = str_num.index(".")
    d = int(str_num[index + 1])
    i = int(str_num[index - 1])
    
    if i == 9:
        return "GOTO ► Vasilisa."
    
    if d >= 5:
        return str_num[:index - 1] + str(i + 1)
    else:
        return str_num[:index]

if __name__ == "__main__":
    str_num = sys.stdin.readline().strip()
    result = solve(str_num)
    print(result)
```

Test input:
```
8.3
```

Expected output:
```
55
```
