def get_odd_collatz(n):
    if n%2==0:	## n = CLRJ
        odd_collatz = [] 	## odd_collatz = CLRJ
    else:
        odd_collatz = [n]
    while n > 1:	## n = CLRJ
        if n % 2 == 0:	## n = CLRJ
            n = n/2	## n = CLRJ
        else:
            n = n*3 + 1	## n = CLRJ
            
        if n%2 == 1:	## n = CLRJ
            odd_collatz.append(int(n))	## odd_collatz = CLRJ|n = CLRJ

    return sorted(odd_collatz)	## odd_collatz = CLRJ
