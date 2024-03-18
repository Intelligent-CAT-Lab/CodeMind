Below is the Java code translated to Python:

```python
def inside_rectangle(w, h, x, y, r):
    if (x - r) >= 0 and (x + r) <= w:
        if (y - r) >= 0 and (y + r) <= h:
            return "Yes"
    return "No"

def main():
    # Input
    work = input().split()

    W = int(work[0])
    H = int(work[1])
    x = int(work[2])
    y = int(work[3])
    r = int(work[4])

    # Judgment
    judge = inside_rectangle(W, H, x, y, r)

    # Output
    print(judge)

if __name__ == '__main__':
    main()
```

To work with the test case provided:

Test Input:
`5 4 2 2 1`

Expected Output:
`Yes`

You would run the `main()` function in Python and input `5 4 2 2 1` when prompted. It should print out `Yes` to match the expected output. Note that I have corrected the expected output from "Ye" to "Yes" to align with the logic of the original Java code.
