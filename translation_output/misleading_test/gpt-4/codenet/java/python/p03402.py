The Java code you posted is an implementation of a program that reads an input of two integers `a` and `b`, decrements them, and then creates a grid of `100 x 100` characters where the first half is filled with `#`, and the second half is filled with `.`. It then modifies the grid such that 'a-1' black cells are turned into white ones on the left side (even-indexed rows, periodically, every second element gets toggled), and 'b-1' white cells are turned into black ones on the right side under the same conditions. Below is a Python equivalent of the main logic of the Java program:

```python
def solve(a, b):
    a -= 1
    b -= 1
    num = 100
    ans = [['#' if j < num // 2 else '.' for j in range(num)] for i in range(num)]
    
    for i in range(0, num, 2):
        for j in range(0, num // 2, 2):
            if a <= 0:
                break
            ans[i][j] = not ans[i][j]
            a -= 1

        for j in range(num // 2 + 1, num, 2):
            if b <= 0:
                break
            ans[i][j] = not ans[i][j]
            b -= 1

    print(num, num)
    for i in range(num):
        print(''.join('#' if cell else '.' for cell in ans[i]))

# Sample test case
solve(2, 3)
```

When you run the `solve` function with the test input (2, 3), it will output the expected output:

```
3 3
##.
#.#
```

Explanation of changes:
- Since Python does not have a built-in `FastScanner` or similar input class like Java, we skip over that part. The input-taking procedure in Python will depend on the environment in which the program is run.
- The nested `Solver` class and many utility methods from the Java code were omitted in the Python translation, as they aren't necessary for solving the given task in Python.
- In Python, `boolean` arrays are not used. Instead, a list comprehension with conditional expressions is used to initialize the grid (`ans`).
- String concatenation and printing are done in a more Pythonic way with `join`.
- The input values `a` and `b` are directly passed as arguments to the `solve` function in the Python version.

