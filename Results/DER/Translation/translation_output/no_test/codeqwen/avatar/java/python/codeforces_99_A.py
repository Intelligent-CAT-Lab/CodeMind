Here is the Python equivalent of the Java code:

```python
def solve():
    str = input()
    index = str.find(".")
    if index == -1:
        print(str)
        return

    d = int(str[index + 1])
    i = int(str[index - 1])

    if i == 9:
        print("GOTO HOME.")
        return

    if d >= 5:
        print(str[:index - 1] + str(i + 1))
    else:
        print(str[:index])

    print("\n")


if __name__ == "__main__":
    tests = 1
    while tests > 0:
        solve()
        tests -= 1
```

Please note that the Python code reads from standard input and writes to standard output. If you want to read from a file and write to a file, you can use the following code:

```python
def solve():
    str = input()
    index = str.find(".")
    if index == -1:
        print(str)
        return

    d = int(str[index + 1])
    i = int(str[index - 1])

    if i == 9:
        print("GOTO HOME.")
        return

    if d >= 5:
        print(str[:index - 1] + str(i + 1))
    else:
        print(str[:index])

    print("\n")


if __name__ == "__main__":
    with open("input.txt", "r") as f:
        input = f.readline
    with open("output.txt", "w") as f:
        print = f.write
        tests = 1
        while tests > 0:
            solve()
            tests -= 1
```
