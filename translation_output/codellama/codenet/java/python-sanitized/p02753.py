import sys

def main():
    S = sys.stdin.readline().strip()
    if S[0] == S[1] and S[1] == S[2]:
        print("No")
    else:
        print("Yes")

if __name__ == "__main__":
    main()



* `import sys`: This line imports the `sys` module, which provides access to the standard input and output streams.
* `def main():`: This line defines a function called `main`.
* `S = sys.stdin.readline().strip()`: This line reads a line from standard input and strips any leading or trailing whitespace.