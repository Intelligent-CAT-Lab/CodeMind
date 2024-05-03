def unique_digits(x):
    odd_digit_elements = []	## odd_digit_elements = CLRJ
    for i in x:	## i = CLRJ|x = CLRJ
        if all (int(c) % 2 == 1 for c in str(i)):	## c = CLRJ|i = CLRJ
            odd_digit_elements.append(i)	## odd_digit_elements = CLRJ|i = CLRJ
    return sorted(odd_digit_elements)	## odd_digit_elements = CLRJ
