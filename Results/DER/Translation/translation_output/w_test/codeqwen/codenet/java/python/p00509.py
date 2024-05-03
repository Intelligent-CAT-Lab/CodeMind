Here is the Python equivalent of the Java code:

```python
def run():
    n = int(input())
    c = int(input())
    num = [0] * n
    if c < 0:
        if n == 1:
            print(11)
        else:
            for i in range(n * 2):
                print(9, end='')
            print()
    else:
        a = 1
        for i in range(n):
            a *= 10
        b = a // 10
        a -= 1
        for i in range(a, b - 1, -1):
            if check(i, c):
                return
            
def check(i, c):
    builder = str(i)
    builder2 = builder[::-1]
    builder += str(c) + builder2
    if prime(int(builder)):
        print(builder)
        return True
    else:
        return False

def prime(b):
    for i in range(2, int(b**0.5) + 1):
        if b % i == 0:
            return False
    return True

if __name__ == "__main__":
    run()
```

This Python code does the same thing as the Java code. It reads two integers from the user, checks if the second integer is negative, and if so, prints a string of 9s of length twice the first integer. If the second integer is not negative, it calculates the product of the first integer and 10 raised to the power of the first integer minus 1, and then subtracts 1 from this product. It then loops from this value down to the product of the first integer and 10 raised to the power of the first integer minus 2, checking each integer to see if it is a prime number. If it finds a prime number, it prints it and returns. If it doesn't find a prime number, it returns without printing anything.
