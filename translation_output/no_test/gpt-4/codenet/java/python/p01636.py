Here's the Java code translated to Python, taking into consideration Python's idiomatic syntax:

```python
def main():
    a = input()
    ans = 0
    
    for i in range(len(a)):
        head = a[:i]
        tail = a[i:]
        
        if head == "":
            h = 0
        elif head == "-":
            continue
        else:
            h = int(head)
        
        if tail == "":
            t = 0
        elif tail[0] == '0':
            continue
        else:
            t = int(tail)
        
        if t < 0:
            continue
        if h > t:
            continue
        if (h + t) % 2 != 0:
            continue
        if (t - h) % 2 != 0:
            continue
        
        ans += 1
    
    print(ans)

if __name__ == "__main__":
    main()
```

Note that there's no direct equivalent in Python for the `INF` and `EPS` variables defined in the original Java code as they are not used anywhere in the provided code. If they were parameters for some floating-point comparisons or limits, the logic would need to be adapted accordingly in Python.
