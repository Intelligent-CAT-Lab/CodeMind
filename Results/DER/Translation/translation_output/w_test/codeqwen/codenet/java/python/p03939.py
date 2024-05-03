Here is the Python equivalent of the Java code:

```python
def main():
    N = int(input())
    d1 = float(input())
    x = float(input())

    ans = 0

    for _ in range(N):
        ans += d1 + (N-0.5)*x
        d1 = ((2*N+2)*d1 + 5*x)/(2*N)
        x = ((N+2)/N)*x

    print(ans)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads three integers from the user, calculates the sum of a sequence, and prints the result. The sequence is defined by the formula `d1 + (N-0.5)*x`, where `N` is the number of terms in the sequence, `d1` is the first term, and `x` is the common difference. The formula for the next term in the sequence is `((2*N+2)*d1 + 5*x)/(2*N)`, and the formula for the next common difference is `((N+2)/N)*x`. The loop runs `N` times, and after each iteration, the current term is added to the running total `ans`. Finally, the total sum is printed to the console.
