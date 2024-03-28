Here's the Python version of your Java code. In Python, we typically don't need to import a scanner like in Java, because we have built-in functions to achieve the same functionality. The `input()` function reads a line from input, and we can use `int()` to convert it to an integer. Python uses a one-line `if-else` expression for conditional logic in this scenario.

```python
def main():
    num = int(input())
    print("ABC" if num < 1200 else "ARC")

if __name__ == "__main__":
    main()
```

To run the test case with input `1000` in a Python environment (assuming the above code is in a script called `p03813.py`), you can run:

```bash
echo "1000" | python p03813.py
```

And you should see the expected output:

```
ABC
```
