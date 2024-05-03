def count_up_to(n):
    primes = []	## primes = CLRJ
    for i in range(2, n):	## i = CLRJ|n = CLRJ
        is_prime = True	## is_prime = CLRJ
        for j in range(2, i):	## j = CLRJ|i = CLRJ
            if i % j == 0:	## i = CLRJ|j = CLRJ
                is_prime = False	## is_prime = CLRJ
                break
        if is_prime:	## is_prime = CLRJ
            primes.append(i)	## primes = CLRJ|i = CLRJ
    return primes	## primes = CLRJ

