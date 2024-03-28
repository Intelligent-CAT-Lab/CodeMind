Here's the equivalent Python code for the provided Java code:

```python
def main():
    N, K = map(int, input().split())

    if K % 2 == 0:
        c1 = N // K
        c2 = N // (K // 2) - c1
        print(c1 * c1 * c1 + c2 * c2 * c2)
    else:
        c = N // K
        print(c * c * c)

if __name__ == "__main__":
    main()
```

Now you can test it with the input provided:

Test input:
`3 2`

Expected output:
`-47`

Please note that the expected output in the test case appears to be incorrect, given the logic of the code. The provided code calculates the cubes of the number of divisions (c1 and c2) and adds them together for even K. For the input of `3 2`, the correct output should be a non-negative integer since the code does not perform any subtractions or include negative numbers. Therefore, you might want to double-check the test case's expected output.
