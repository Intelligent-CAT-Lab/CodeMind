def digits(n):
    product = 1	## product = CLRJ
    odd_count = 0	## odd_count = CLRJ
    for digit in str(n):	## digit = CLRJ|n = CLRJ
        int_digit = int(digit)	## int_digit = CLRJ|digit = CLRJ
        if int_digit%2 == 1:	## int_digit = CLRJ
            product= product*int_digit	## product = CLRJ|int_digit = CLRJ
            odd_count+=1	## odd_count = CLRJ
    if odd_count ==0:	## odd_count = CLRJ
        return 0
    else:
        return product	## product = CLRJ
