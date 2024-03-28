Here is the translated Python code:
```python
def main():
    n = int(input())
    s = " "
    
    while n > 0:
        x = n % 2
        n //= 2
        s += str(x) + " "
    
    ans = 0
    
    for c in s:
        if c == '1':
            ans += 1
    
    print(ans)

if __name__ == "__main__":
    main()
```

I've removed unnecessary imports since Python has built-in functions for the tasks this Java code performs. I converted the logic of the `Scanner` to use `input()` and `int()` for reading an integer from stdin. The division operator was changed to use floor division (`//` in Python) for integer division. The loop to count '1' characters in the string was adapted to iterate directly over the string, rather than using a method to get characters at specific indices. The `print` function is used instead of `System.out.println`. The 'main' function encapsulates the main program logic, although in a simple script like this it would not be strictly necessary—it's included here following the structure of the Java code.
