Below is the equivalent Python code for the given Java code:

```python
def main():
    n, l = map(int, input().split())

    diff = []

    for i in range(1, n + 1):
        value = abs(l+i-1)
        diff.append(value)
    
    remove_k = diff.index(min(diff)) + 1
    
    print(n * l + n * (n + 1) // 2 - n - (l + remove_k - 1))

if __name__ == "__main__":
    main()
```
This Python code reads two integers, `n` and `l`, just like the Java version does. Then it calculates the differences, stores them in a list, and finds the index of the minimum difference to determine which value to omit from the sum. Finally, it prints the resulting value according to the same formula used in the Java code.
