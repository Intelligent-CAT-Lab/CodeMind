Here is the Python version of the Java code you provided:

```python
import sys

MOD = 1000000007
SIZE = 1005
dp = [[-1 for _ in range(SIZE)] for _ in range(SIZE)]

def recursive(num_ball, num_box):
    if dp[num_ball][num_box] != -1:
        return dp[num_ball][num_box]

    if num_ball == 0:
        return 1
    elif num_box == 1:
        return 1

    ret = 0
    for next_box in range(1, num_box + 1):
        next_ball = num_ball - next_box
        if next_ball < 0:
            break
        ret += recursive(next_ball, next_box)
        ret %= MOD

    return dp[num_ball][num_box] = ret

def main():
    num_ball, num_box = map(int, sys.stdin.readline().split())
    print(recursive(num_ball, num_box))

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code you provided. It reads two integers from the standard input, calculates the number of ways to distribute the balls into boxes using dynamic programming, and prints the result. The `recursive` function is a helper function that implements the dynamic programming algorithm. The `main` function reads the input and calls the `recursive` function to calculate the result.
