Here is the Java code translated into Python:

```python
def n_combination_3(c):
    count = c
    num = 0
    for i in range(count - 2):
        for j in range(i + 1, count - 1):
            for k in range(j + 1, count):
                num += 1


def main():
    s = input()
    current_length = 0
    maximum_length = 0
    for i in s:
        if i in 'ACGT':
            current_length += 1
        else:
            maximum_length = max(maximum_length, current_length)
            current_length = 0
    # Need to check after the loop if the last sequence was the longest
    maximum_length = max(maximum_length, current_length)
    print(maximum_length)


if __name__ == "__main__":
    main()
```

When you provide "ATCODER" as input to this program, it will output '3' which is the expected output.
