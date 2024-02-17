
n=int(input())
def factorize(n):
    b = 2
    fct = []
    while b * b <= n:
        while n % b == 0:
            n //= b
            fct.append(b)
        b = b + 1
    if n > 1:
        fct.append(n)
    return fct

x=factorize(n)
L=[str(a) for a in x]
L=" ".join(L)
print(f'{n}: {L}')

