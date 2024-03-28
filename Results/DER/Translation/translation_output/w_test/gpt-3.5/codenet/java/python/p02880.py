```python
def main():
    N = int(input())
    f = False
    for A in range(1, 10):
        if N % A == 0 and N // A < 10:
            f = True
    ret = "Yes" if f else "No"
    print(ret)

if __name__ == "__main__":
    main()
```
