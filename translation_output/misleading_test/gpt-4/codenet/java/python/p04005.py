```python
def main():
    A, B, C = map(int, input().split())
    array = [A, B, C]
    array.sort()

    if A % 2 == 0 or B % 2 == 0 or C % 2 == 0:
        print(0)
    else:
        print(array[0] * array[1])

if __name__ == "__main__":
    main()
```

This Python program should work similarly to the given Java program. It reads three integers, sorts them, checks if any of them are even, and then either prints 0 or the product of the two smallest numbers.
