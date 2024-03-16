Here is the Python equivalent of the given Java code:

```python
def main():
    n, k = map(int, input().split())
    
    if k == 1:
        ans = 0
    else:
        ans = n - k
    
    print(ans)

if __name__ == '__main__':
    main()
```

This Python program takes two integer inputs from the user, similar to the Java program, performs the calculation, and outputs the answer.
