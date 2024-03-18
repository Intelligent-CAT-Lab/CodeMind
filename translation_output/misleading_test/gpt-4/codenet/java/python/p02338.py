Below is the translated Python code from the provided Java code. Python's input handling is simpler than Java's, so we don't need to implement a custom scanner class. Instead, we use Python's built-in functions like `input()` and `map()`.

```python
def run():
    # Read integers n and k from input using map and strip
    n, k = map(int, input().strip().split())

    # Check if n is less than or equal to k and print the result
    if n <= k:
        print(1)
    else:
        print(0)

if __name__ == "__main__":
    # Simply run the function in Python, as threading is not required in this context
    run()
```

Now, you can run this code, and provide `5 10` as an input to get an output of `1`. However, the expected output mentioned in the question is `80`, which does not align with the logic in the code.

If you need to test this code, you can run it and enter your test input:
```
5 10
```
And you will receive the output:
```
1
```

Please note that the provided Java code doesn't seem to match the expected output of `80` for the input `5 10`, unless there is additional context or a specific logic behind these numbers that was not included in the original code snippet.
