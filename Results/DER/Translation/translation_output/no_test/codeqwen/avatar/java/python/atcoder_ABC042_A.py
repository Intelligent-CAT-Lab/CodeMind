Here is the Python equivalent of the Java code:

```python
def main():
    num_1 = int(input())
    num_2 = int(input())
    num_3 = int(input())

    if num_1 == 7:
        if num_2 == 5 and num_3 == 5:
            print("YES")
        else:
            print("NO")
    elif num_2 == 7:
        if num_1 == 5 and num_3 == 5:
            print("YES")
        else:
            print("NO")
    elif num_3 == 7:
        if num_2 == 5 and num_1 == 5:
            print("YES")
        else:
            print("NO")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads three integers from the user, checks if any of them is 7 and if the other two are 5, and prints "YES" if they are, and "NO" otherwise.
