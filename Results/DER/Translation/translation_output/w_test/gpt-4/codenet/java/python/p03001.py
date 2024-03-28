Below is the translated version of the provided Java code into Python:

```python
def main():
    w, h, x, y = map(int, input().split())
    ans = float(w) * float(h) / 2
    a = 1 if (x + x == w and y + y == h) else 0
    print(f'{ans:.6f} {a}')

if __name__ == '__main__':
    main()
```

To use the sample test case provided:

Test input (enter this in the terminal when prompted):
```
2 3 1 2
```

Expected output:
```
3.000000 0
```
