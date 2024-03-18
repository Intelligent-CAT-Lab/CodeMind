```python
import sys

def main():
    n, c = map(int, sys.stdin.readline().split())
    if c < 0:
        if n == 1:
            print(11)
        else:
            print(int("9" * (n * 2)))
    else:
        a = 1
        b = 0
        for i in range(n):
            a *= 10
        b = a // 10
        a -= 1
        found = False
        for i in range(a, b-1, -1):
            if check(i, c):
                found = True
                break
        if not found:
            print(-1)

def check(i, c):
    s = str(i)
    s_reversed = s[::-1]
    result = int(s + str(c) + s_reversed)
    if prime(result):
        print(result)
        return True
    return False

def prime(num):
    if num < 2:
        return False
    for i in range(2, int(num**0.5)+1):
        if num % i == 0:
            return False
    return True

if __name__ == "__main__":
    main()
```
Test the code with the given input to see if it produces the expected output. If you have any issues or questions, feel free to ask!
