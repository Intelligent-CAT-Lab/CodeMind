```python
def main():
    a = int(input())
    b = int(input())

    if a >= b:
        for i in range(a):
            print(b, end='')
    else:
        for i in range(b):
            print(a, end='')

if __name__ == "__main__":
    main()
```
