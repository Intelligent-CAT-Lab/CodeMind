Here is a Python version of the given Java code:

```python
def main():
    n = int(input())

    n1 = n % 10
    n10 = (n - n1) % 100 // 10
    n100 = (n - n1 - n10 * 10) % 1000 // 100
    n1000 = n // 1000

    if (n1 == n10 and n1 == n100) or (n10 == n100 and n10 == n1000):
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()
```

This Python code replicates the functionality of the Java version. When the script is run, it reads an integer from the user, calculates the individual digits, and prints "Yes" if the conditions are met, otherwise it prints "No".
