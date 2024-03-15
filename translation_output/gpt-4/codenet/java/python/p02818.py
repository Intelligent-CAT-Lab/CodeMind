Here's the translated code from Java to Python:

```python
def main():
    # Using split() method to read multiple values on one line separated by spaces
    A, B, K = map(int, input().split())

    if K <= A:
        A -= K
    elif K <= A + B:
        B -= K - A
        A = 0
    else:
        A = 0
        B = 0

    print(A, B)

if __name__ == "__main__":
    main()
```
