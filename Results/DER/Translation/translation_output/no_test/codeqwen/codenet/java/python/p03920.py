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

This Python code does the same thing as the Java code. It reads an integer from the user, then enters a loop that continues until the user's input is less than or equal to zero. Inside the loop, it calculates the sum of all integers from 1 to N, and if the sum is greater than or equal to N, it prints the current integer and subtracts it from N. The loop continues until N is less than or equal to zero.
