def generate_integers(a, b):
    lower = max(2, min(a, b))	## lower = CLRJ|a = CLRJ|b = CLRJ
    upper = min(8, max(a, b))	## upper = CLRJ|a = CLRJ|b = CLRJ

    return [i for i in range(lower, upper+1) if i % 2 == 0]	## i = CLRJ|lower = CLRJ|upper = CLRJ
