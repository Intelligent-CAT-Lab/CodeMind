def special_factorial(n):
    fact_i = 1	## fact_i = CLRJ
    special_fact = 1	## special_fact = CLRJ
    for i in range(1, n+1):	## i = CLRJ|n = CLRJ
        fact_i *= i	## fact_i = CLRJ|i = CLRJ
        special_fact *= fact_i	## special_fact = CLRJ|fact_i = CLRJ
    return special_fact	## special_fact = CLRJ
