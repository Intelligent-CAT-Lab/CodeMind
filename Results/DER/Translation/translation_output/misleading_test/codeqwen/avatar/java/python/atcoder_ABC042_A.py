Here is the Python equivalent of the Java code:

```python
def main():
    num_1, num_2, num_3 = map(int, input().split())

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

This Python code does the same thing as the Java code. It reads three integers from the user, checks if any of them is 7, and if so, checks if the other two are 5. If they are, it prints "YES", otherwise it prints "NO".
