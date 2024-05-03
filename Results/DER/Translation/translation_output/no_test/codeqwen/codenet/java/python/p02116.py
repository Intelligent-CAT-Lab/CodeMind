Here is the Python equivalent of the Java code:

```python
def main():
    str = input()

    if str == "":
        exit(0)

    else:
        res = int(str)
        han = 0
        ni_beki = 1
        ruijyo = 0

        while True:
            han = (res >> ruijyo) % 2
            if han == 0:
                res = (res % ni_beki) + 1
                break
            else:
                ni_beki = ni_beki * 2
                ruijyo += 1

        print(res)


if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a string from the user, converts it to an integer, and then performs the same operations as the Java code. The `input()` function in Python is equivalent to `BufferedReader.readLine()` in Java. The `exit(0)` function in Python is equivalent to `System.exit(0)` in Java. The `print()` function in Python is equivalent to `System.out.println()` in Java. The `int()` function in Python is equivalent to `Long.parseLong()` in Java. The `while` loop in Python is equivalent to the `for` loop in Java. The `break` statement in Python is equivalent to the `break` statement in Java.
