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
            for _ in range(n * 2):
                print(9, end='')
            print()
    else:
        a = 1
        for _ in range(n):
            a *= 10
        b = a // 10
        a -= 1
        for i in range(a, b - 1, -1):
            if check(i, c):
                return
            
def check(i, c):
    builder = str(i) + str(c) + str(i)[::-1]
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

This Python code does the same thing as the Java code. It reads two integers from the user, checks if the second integer is negative, and if so, prints a string of 9s of length twice the first integer. If the second integer is not negative, it calculates the range of integers from `a` to `b` (where `a` is `10^n - 1` and `b` is `10^(n-1)`), and for each integer in this range, it checks if the concatenation of the integer, the second integer, and the reverse of the integer is a prime number. If it is, it prints the concatenated string and returns. If no such integer is found, it returns.
