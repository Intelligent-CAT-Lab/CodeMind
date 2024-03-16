Here is the translated code from Java to Python:

```python
# No need to import a scanner in Python, we use the input() function instead.

def atcoder_ABC142_A():
    N = int(input())
    sum = 0
    
    for i in range(1, N + 1):
        if i % 2 != 0:
            sum += 1
    
    print(sum / N)

atcoder_ABC142_A()
```

I've translated the Java method into a Python function. In Python, we use `input()` to get user input, which returns everything as a string, so we need to cast it to `int` for numerical operations. Also, note that in Python, loops are inclusive of the start and exclusive of the end, so we need to go up to `N + 1` to be equivalent to `<= N` in Java. The division and print statements are straightforward translations.
