def is_simple_power(x, n):
    if (n == 1): 	## n = CLRJ
        return (x == 1) 
    power = 1	## power = CLRJ
    while (power < x): 	## power = CLRJ|x = CLRJ
        power = power * n 	## power = CLRJ|n = CLRJ
    return (power == x) 	## power = CLRJ|x = CLRJ
