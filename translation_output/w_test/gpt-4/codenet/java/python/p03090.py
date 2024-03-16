The equivalent Python code would look like this:

```python
def solve(a, l):
    if a % 2 == 0:
        for i in range(1, a // 2 + 1):
            for j in range(i + 1, a // 2 + 1):
                l.append(f"{i} {j}")
                l.append(f"{i} {a + 1 - j}")
                l.append(f"{a + 1 - i} {j}")
                l.append(f"{a + 1 - i} {a + 1 - j}")
    else:
        solve(a - 1, l)
        for i in range(1, a):
            l.append(f"{a} {i}")
    

def main():
    a = int(input())
    
    l = []
    solve(a, l)
    print(len(l))
    
    for s in l:
        print(s)

# Test input
if __name__ == "__main__":
    main()
```

To use this code, put it in a file named `p03090.py` for example, then run the script and input the number `3`. The expected output will be:

```
2
1 3
2 3
```

Remember that the Python script reads input directly from the command line, as opposed to Java, which can deal with `Scanner` inputs from various sources.
