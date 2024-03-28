Here's the equivalent Python code for the provided Java snippet:

```python
def main():
    s = int(input())
    seen = set([s])
    i = 1
    while True:
        i += 1
        if s % 2 == 0:
            s = s // 2
        else:
            s = 3 * s + 1
        if s in seen:
            print(i)
            return
        else:
            seen.add(s)

if __name__ == "__main__":
    main()
```

To test this Python code with the provided test input (8) and check for the expected output (62), you can run the program and input the value 8 when prompted. If you're running this in an environment where you can't provide input interactively, you can modify the `main` function to accept a parameter and use that instead. Here's how you can modify the `main` function to accept a parameter instead of reading from standard input:

```python
def main(s):
    seen = set([s])
    i = 1
    while True:
        i += 1
        if s % 2 == 0:
            s = s // 2
        else:
            s = 3 * s + 1
        if s in seen:
            print(i)
            return
        else:
            seen.add(s)

if __name__ == "__main__":
    test_input = 8
    main(test_input)  # Expected output: 62
```

If you use this version of the code, it will immediately run the test with the input 8 upon execution without waiting for interactive input.
