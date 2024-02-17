def fib(n,memo={}):
    if n==0 or n==1:
        return 1
    elif n in memo:
        return memo[n]
    else:
        memo[n]= fib(n-1,memo)+fib(n-2,memo)
        return memo[n]
n=int(eval(input()))
print((fib(n)))
