Below is the translated Python code, which should achieve the same functionality as the Java code:

```python
def main():
    S = input()
    N = len(S)
    ans = [0] * N
    curIndex = 0
    while curIndex < N:
        numLeft = 0
        numRight = 0
        while curIndex < N and S[curIndex] == 'R':
            numRight += 1
            curIndex += 1
        # The line for decrementing curIndex after the final L/R is not necessary in Python.
        R = curIndex - 1
        while curIndex < N and S[curIndex] == 'L':
            numLeft += 1
            curIndex += 1
        left = numLeft
        right = numRight
        # Adding children to adjacent numbers as evenly as possible
        if (left + right) % 2 == 0:
            sum = left + right
            left, right = sum // 2, sum // 2
        else:
            sum = left + right
            if numRight % 2 == 1:
                right = sum // 2
                left = sum - right
            else:
                left = sum // 2
                right = sum - left
        ans[R] = left
        ans[R + 1] = right  # Children moving swaps squares
        if curIndex == N - 1:
            break
    
    print(" ".join(map(str, ans)))

if __name__ == "__main__":
    main()
```

Note that several differences exist between Java and Python. For example:

- In Python, we don't need to declare types of variables.
- Python uses indentation instead of braces `{}` to define blocks of code.
- Division of integers using `//` in Python to get integer division similar to Java's `/`.
- The `print` function is used to output results in Python, and we can use `" ".join(map(str, ans))` to concatenate the integer values in a string, separated by spaces.
- The `main` function is not a required pattern in Python, but we define and call it to structure the program similarly to the Java code.
- We check the boundary conditions directly in the `while` loop conditions rather than using `break` inside the loop when `curIndex == N`.
