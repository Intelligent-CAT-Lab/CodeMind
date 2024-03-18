```python
import sys

def main():
    x, y, a, b = map(int, input().split())
    res = []
    for i in range(a, x+1):
        for j in range(b, y+1):
            if i <= j:
                continue
            res.append(str(i) + " " + str(j))
    
    print(len(res))
    for r in res:
        print(r)

if __name__ == "__main__":
    main()
```

You can use this Python code to achieve the same functionality as the given Java code.
