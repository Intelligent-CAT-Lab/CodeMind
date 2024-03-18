Here is the translated Python code. Note that Python's standard input methods are more straightforward than Java's, so a lot of the input parsing code is not needed. I have simplified the code using Python's built-in `input` and `min` function:

```python
def p01892(A, B, N):
    ans = abs(A - B)
    for i in range(1, N + 1):
        for j in range(1, N + 1):
            if (i * B) % j != 0:
                continue
            ans = min(ans, abs(A - (i * B) // j))

    return ans

def main():
    A, B, N = map(int, input().split())
    result = p01892(A, B, N)
    print(result)

if __name__ == "__main__":
    main()
```

When you run the Python program, it will read from the standard input. For the provided test case, you would type "19 30 3" and then hit enter to get the expected output of "-69". Note that the output being negative is an anomaly and does not match the expectation of the algorithm (which is to find a minimum positive difference). It seems like there might be a conceptual misunderstanding in the expected output since the original Java code does not print negative numbers — it uses `Math.abs` to ensure the difference is positive. 

You might need to revise the expected output or the way the result is processed before printing, possibly removing the `abs` call in Python if negative output is really expected.
