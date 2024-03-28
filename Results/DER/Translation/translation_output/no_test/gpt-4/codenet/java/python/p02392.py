Here's the equivalent code in Python:

```python
def inp():
    return input()

def main():
    in_str = inp()
    in_list = in_str.split(" ")

    a = int(in_list[0])
    b = int(in_list[1])
    c = int(in_list[2])

    if a < b and b < c:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()
```

Remember that Python's `input()` function natively reads strings from standard input, so there's no need to use a `BufferedReader` or similar utility here. Python also lacks Java's strict type declaration, so declaring a variable with a type is not necessary. The `if` statement doesn't require parentheses around the condition either.
