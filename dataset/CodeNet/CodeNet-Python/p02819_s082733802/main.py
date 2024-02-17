def isPrime(n):
    div = 2
    while div * div <= n:
        if n % div == 0: return False
        div += 1
    return True

X = int(input())
while not isPrime(X): X+=1
print(X)
