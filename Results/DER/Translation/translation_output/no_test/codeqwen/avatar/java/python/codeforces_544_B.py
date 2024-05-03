Here is the Python equivalent of the Java code:

```python
def print_island(n, count):
    a = (n + 1) // 2
    b = n // 2
    max_count = a * a + b * b
    if count > max_count:
        print("NO")
        return
    print("YES")
    for i in range(n):
        for j in range(n):
            if (i + j) % 2 == 0 and count > 0:
                print('L', end='')
                count -= 1
            else:
                print('S', end='')
        print()

def main():
    n = int(input())
    count = int(input())
    print_island(n, count)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the user, calculates the maximum number of 'L's that can be placed on the island, and then prints the island accordingly. If the number of 'L's to be placed exceeds the maximum, it prints "NO". Otherwise, it prints "YES" and then prints the island.
