Here is the Python equivalent of the Java code:

```python
def main():
    N = int(input())
    if N == 1:
        print(1)
        print(0)
    elif N == 2:
        print(2)
        print(0)
        print(11)
    else:
        print(N - 1)
        for i in range(2, N + 1):
            s = '1' * i
            s = s[0] + '0' + s[1:-1] + '0'
            print(s)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads an integer from the user, and then prints the appropriate output based on the value of the integer. The main function is defined to encapsulate the logic of the program. The main function is then called at the end of the program.
