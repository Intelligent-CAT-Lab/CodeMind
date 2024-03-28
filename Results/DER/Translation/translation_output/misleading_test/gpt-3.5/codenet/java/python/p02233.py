```python
memo = [0] * 100

def fib(n):
    if memo[n] != 0:
        return memo[n]
    if n == 0 or n == 1:
        memo[n] = 1
        return memo[n]
    memo[n-1] = fib(n-1)
    memo[n-2] = fib(n-2)
    return memo[n-1] + memo[n-2]

if __name__ == "__main__":
    n = int(input())
    print(fib(n))
``` 

Please provide more test cases if you would like to validate the python code further.
