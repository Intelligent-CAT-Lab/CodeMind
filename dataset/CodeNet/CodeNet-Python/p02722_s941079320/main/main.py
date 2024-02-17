N = int(input().split()[0])

def make_divisors(n):
    divisors = []
    for i in range(1, int(n**0.5)+1):
        if n % i == 0:
            divisors.append(i)
            if i != n // i:
                divisors.append(n//i)

    # divisors.sort()
    return divisors

Nod = make_divisors(N-1)
divs = make_divisors(N)

for d in divs:
    c = N
    while True:
        if d == 1:
            break
        if c%d == 1:
            Nod.append(d)
            break
        elif c%d == 0:
            c = c//d;
            continue
        else:
            break

print((len(Nod)-1))