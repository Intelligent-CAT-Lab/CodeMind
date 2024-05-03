def hex_key(num):
    primes = ('2', '3', '5', '7', 'B', 'D')	## primes = CLRJ
    total = 0	## total = CLRJ
    for i in range(0, len(num)):	## i = CLRJ|num = CLRJ
        if num[i] in primes:	## num = CLRJ|i = CLRJ|primes = CLRJ
            total += 1	## total = CLRJ
    return total	## total = CLRJ
