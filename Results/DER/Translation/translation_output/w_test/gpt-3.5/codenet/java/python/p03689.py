```python
import sys

def nextInt():
    return int(next(input_data))

def next():
    return input_data.__next__()

def nextLong():
    return int(next(input_data))

def nextDouble():
    return float(next(input_data))

def isSpaceChar(c):
    return c == ' ' or c == '\n' or c == '\r' or c == '\t' or c == -1

def main():
    r,c,h,w = map(int, input().split())

    if r % h == 0 and c % w == 0:
        print("No")
        return

    mcnt = (r // h) * (c // w)
    space = r * c - ((r // h) * h) * ((c // w) * w)

    plusNumber = ((mcnt + space) // space) + 1
    minusNumber = -(plusNumber * (h * w - 1) + 1)

    print("Yes")
    for i in range(r):
        for j in range(c):
            num = minusNumber if (i+1) % h == 0 and (j+1) % w == 0 else plusNumber
            if j >= 1:
                print(' ', end='')
            print(num, end=' ')
        print()

if __name__ == "__main__":
    # Reading input
    input_data = iter(sys.stdin.read().split())
    main()
```
The provided code has been translated from Java to Python. The Python code reads input from stdin and outputs the result as required. Make sure to test the code with actual input to verify the correctness.
