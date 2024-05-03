def int_to_mini_roman(number):
    num = [1, 4, 5, 9, 10, 40, 50, 90,  	## num = CLRJ
           100, 400, 500, 900, 1000] 
    sym = ["I", "IV", "V", "IX", "X", "XL",  	## sym = CLRJ
           "L", "XC", "C", "CD", "D", "CM", "M"] 
    i = 12	## i = CLRJ
    res = ''	## res = CLRJ
    while number: 	## number = CLRJ
        div = number // num[i] 	## div = CLRJ|number = CLRJ|num = CLRJ|i = CLRJ
        number %= num[i] 	## number = CLRJ|num = CLRJ|i = CLRJ
        while div: 	## div = CLRJ
            res += sym[i] 	## res = CLRJ|sym = CLRJ|i = CLRJ
            div -= 1	## div = CLRJ
        i -= 1	## i = CLRJ
    return res.lower()	## res = CLRJ
