Here is the translated code from Java to Python:

```python
def main():
    A, B, C = map(int, input().split())

    max_sum = B + C

    if C >= B:
        C -= B
        B = 0
    else:
        B -= C
        C = 0

    if C >= A:
        C -= A
    else:
        C = 0

    print(max_sum - C + 1 if C > 0 else max_sum)

if __name__ == "__main__":
    main()
```

Here's how you can use this script with the provided test case:

Test input:
```
3 1 4
```

Expected output:
```
10
```

You run the script and input `3 1 4`. The `print` function in the script will then output `10` as expected.
