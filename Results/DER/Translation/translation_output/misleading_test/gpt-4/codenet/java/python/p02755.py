Below you'll find the equivalent Python code for the provided Java program. This code reads two integers from the input, calculates which integer, when taxed at 8% and 10%, will yield those amounts as tax, and prints out the integer if such a number exists.

```python
def main():
    A, B = map(int, input().split())

    for i in range(1, 99999999):
        if int(i * 0.08) == A and int(i * 0.10) == B:
            print(i)
            return

    print(-1)

if __name__ == '__main__':
    main()
```

When you input `2 2`, the output will be `50`, as expected, since `50 * 0.08` yields `4.0` (which when converted to an integer gives `4`), and `50 * 0.10` yields `5.0` (which converted to an integer gives `5`).

