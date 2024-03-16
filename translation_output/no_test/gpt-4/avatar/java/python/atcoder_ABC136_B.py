Here's the translated Python code:

```python
def atcoder_ABC136_B():
    N = int(input())
    count = 0
    temp = N
    ans = 0
    
    while temp > 0:
        temp //= 10
        count += 1

    for i in range(1, count + 1):
        if i == count:
            if i % 2 == 1:
                ans += (N - 10**(i - 1) + 1)
        else:
            if i == 1:
                ans += 9
            elif i % 2 == 1:
                ans += (10**i - 10**(i - 1))
    
    print(ans)

if __name__ == "__main__":
    atcoder_ABC136_B()
```

Please note the following changes I made while translating:

1. In Python, you don't need to import a Scanner as you can use `input()` to get user input.
2. `temp /= 10` is integer division in Java, which in Python is done using `//`.
3. I used `int(input())` to get an integer input directly, instead of creating a scanner object.
4. `Math.pow` is just `**` in Python for exponentiation.
5. There's no need to declare variables beforehand in Python.
6. The `print` function is used to output the result instead of `System.out.println`.
7. Python for-loops iterate over a range object; `range` is inclusive of the first argument and exclusive of the second, which is why I used `range(1, count + 1)` to emulate the inclusive behavior of `for (int i = 1; i <= count; i++)` in Java.
8. It's common practice to include `if __name__ == "__main__":` in Python to ensure that the main code only runs when the script is executed directly.
