Here is the Python equivalent of the Java code:

```python
def main():
    a, b, c = map(int, input().split())
    amount = 0
    time = a
    
    for i in range(2, c + 1):
        amount += b
        time = a * i
    
    print(amount)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads three integers from the user, calculates the total amount by adding the base amount (b) to itself 'a' times, and then prints the total amount.
