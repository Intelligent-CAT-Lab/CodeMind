Here is the equivalent Python code for the given Java snippet:

```python
class P02730:

    def __init__(self):
        self.s = input()  # to read the input string

    def run(self):
        arr = list(self.s)  # converts string to a list of characters

        for i in range(len(self.s) // 2):
            if arr[i] != arr[len(self.s) - 1 - i]:
                print("No")
                return

        for i in range((len(self.s) // 2) - 1):
            if arr[i] != arr[(len(self.s) // 2) - 1 - i]:
                print("No")
                return

        print("Yes")


if __name__ == '__main__':
    p02730 = P02730()
    p02730.run()
```

In this Python version, the `Scanner` and `PrintWriter` are replaced with the use of `input()` for reading from standard input and `print()` for writing to standard output. The `P02730` class is instantiated and its `run` method is called to execute the program's logic, just like in the Java version. The `__name__ == '__main__'` check is used to ensure the script is run as the main program and not imported as a module.
