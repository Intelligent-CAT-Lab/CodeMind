Here is the Python equivalent of the Java code:

```python
def main():
    N = int(input())
    while N > 0:
        sum = 0
        for i in range(1, N+1):
            sum += i
            if sum >= N:
                print(i)
                N -= i
                break

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads an integer from the user, then enters a loop that continues until the user's input is 0. In each iteration of the loop, it calculates the sum of all integers from 1 to N, and prints the first integer that makes the sum equal to or greater than N. It then subtracts that integer from N and continues the loop.
