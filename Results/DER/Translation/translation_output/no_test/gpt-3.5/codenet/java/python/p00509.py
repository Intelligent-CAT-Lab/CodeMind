```python
import sys

def main():
    n, c = map(int, input().split())
    if c < 0:
        if n == 1:
            print(11)
        else:
            print('9' * (n * 2))
    else:
        a = 1
        for _ in range(n):
            a *= 10
        b = a // 10
        a -= 1
        for i in range(a, b-1, -1):
            if check(i, c):
                return

def check(i, c):
    num_str = str(i)
    num_reversed_str = num_str[::-1]
    combined_str = num_str + str(c) + num_reversed_str
    if is_prime(int(combined_str)):
        print(combined_str)
        return True
    else:
        return False

def is_prime(num):
    for i in range(2, int(num**0.5)+1):
        if num % i == 0:
            return False
    return True

if __name__ == "__main__":
    main()
```

