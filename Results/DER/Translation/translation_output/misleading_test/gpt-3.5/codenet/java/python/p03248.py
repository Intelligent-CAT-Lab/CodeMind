```python
import sys

def main():
    c = input().strip()
    l = len(c)

    if c[0] == '0' or c[l-1] == '1':
        print(-1)
        return
    else:
        for i in range(l // 2):
            if c[i] != c[l-i-2]:
                print(-1)
                return

    print(1, 2)

    s = 2
    for i in range(3, l+1):
        print(s, i)
        if c[i-2] == '1':
            s = i


if __name__ == "__main__":
    main()
```

