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

This Python code does the same thing as the Java code. It reads an integer from the user, then enters a loop that continues until the input number is reduced to zero. Inside the loop, it calculates the sum of all integers from 1 to the current input number, and prints the first integer that causes the sum to exceed the input number. It then subtracts this integer from the input number and continues the loop. The loop continues until the input number is reduced to zero.
