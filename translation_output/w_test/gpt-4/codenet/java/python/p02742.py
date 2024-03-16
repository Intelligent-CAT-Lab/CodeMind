Here is the equivalent Python code for the provided Java code:

```python
def main():
    w, h = map(int, input().split())
    
    if w == 1 or h == 1:
        print(1)
    else:
        c = (w * h) // 2 if (w * h) % 2 == 0 else (w * h) // 2 + 1
        print(c)

if __name__ == '__main__':
    main()
```

When you run this Python code, you will get the expected output:

Test input:
4 5

Expected output:
10
