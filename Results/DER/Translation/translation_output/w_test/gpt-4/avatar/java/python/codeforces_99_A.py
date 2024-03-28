Here's the Java code translated to Python:

```python
import sys

def main():
    if not hasattr(sys, 'ps1'):
        input_file = open("/home/changshu/CodeMind/dataset/Avatar/Avatar-java/codeforces_99_A/input.txt", "r")
        output_file = open("/home/changshu/CodeMind/dataset/Avatar/Avatar-java/codeforces_99_A/output.txt", "w")
    else:
        input_file = sys.stdin
        output_file = sys.stdout

    tests = 1
    while tests > 0:
        tests -= 1
        solve(input_file, output_file)

    if not hasattr(sys, 'ps1'):
        output_file.close()
        input_file.close()

def solve(input_file, output_file):
    str_ = input_file.readline().strip()
    index = str_.find('.')
    if index == -1:
        output_file.write(str_)
        return

    d = int(str_[index + 1])
    i = int(str_[index - 1])

    if i == 9:
        output_file.write("GOTO Vasilisa.\n")
        return

    if d >= 5:
        output_file.write(str_[:index - 1] + str(i + 1) + "\n")
    else:
        output_file.write(str_[:index] + "\n")

# Call the main method
if __name__ == "__main__":
    main()
```

And if you run the Python code with the test input `8.3`, you would get the expected output as `8`.

Please note that in Python, read and write operations are commonly done without the need for imported BufferReader/BufferWriter classes used in Java. Python's `open` is used to get a file handle, while `sys.stdin` and `sys.stdout` are used for standard input and output.
