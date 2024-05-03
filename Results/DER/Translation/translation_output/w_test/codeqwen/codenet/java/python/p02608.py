Here is the Python equivalent of the Java code:

```python
def main():
    n = int(input())
    eratosu = [0] * 100000

    for i in range(1, 101):
        for j in range(1, 101):
            for k in range(1, 101):
                if i * i + j * j + k * k >= 100000:
                    continue
                result = i * i + j * j + k * k + i * j + j * k + k * i
                eratosu[result] += 1

    print(eratosu[1])
    for i in range(2, n + 1):
        print(eratosu[i])

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It first initializes an array `eratosu` of size 100000 with all elements set to 0. Then it iterates over all possible combinations of three numbers `i`, `j`, and `k` (ranging from 1 to 100) and calculates the sum of their squares and the sum of their squares plus the sum of their products. If the result is less than 100000, it increments the corresponding element in the `eratosu` array. Finally, it prints the first element of the `eratosu` array and then prints the elements from index 2 to `n` inclusive.
