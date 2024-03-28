Here's the equivalent Python code for the provided Java code:

```python
def main():
    # We don't need a scanner object in Python, as we can use input() directly
    s = input()

    # Calculate the result using string methods and count the occurrences of 'o'
    result = (s.count('o') * 100) + 700
    print(result)


if __name__ == "__main__":
    main()
```

You can test this with the provided test case:

Test input:
```
oxo
```

Expected output:
```
977
```
