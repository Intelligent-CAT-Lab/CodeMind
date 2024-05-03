Here is the Python equivalent of the Java code:

```python
def main():
    X = int(input())
    prime = X
    mid = prime // 2
    flag = False

    while True:
        for i in range(2, mid + 1):
            if prime % i == 0:
                flag = True
                break
        
        if not flag:
            break
        else:
            flag = False
        
        prime += 1

    print(prime)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It takes an integer input from the user, checks if it is a prime number, and if not, it increments the number until it finds a prime number. The prime number is then printed out.
