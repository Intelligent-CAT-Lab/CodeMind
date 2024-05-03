Here is the Python equivalent of the Java code:

```python
import math

def main():
    n = int(input())

    if n == 1:
        print(0)
        return

    p_map = {}
    for i in range(2, int(math.sqrt(n)) + 1):
        count = 0
        while n % i == 0:
            count += 1
            n /= i
        if count > 0:
            p_map[i] = count

    if n != 1:
        p_map[n] = 1

    ans = 0
    for p_count in p_map.values():
        i = 1
        while p_count >= i:
            p_count -= i
            ans += 1
            i += 1

    print(ans)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads an integer from the user, then calculates the prime factors of the number. It then counts the number of times each prime factor appears in the factorization, and adds up the number of times each prime factor appears minus one. This is the number of times the prime factor can be used in the factorization of the number. The result is printed to the console.
