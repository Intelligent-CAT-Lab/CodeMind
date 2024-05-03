def f(float_number):
    number = str(float_number)	## number = CLRJ | float_number = CLRJ
    dot = number.find('.')	## dot = CLRJ | number = CLRJ
    if dot != -1:	## dot = CLRJ
        return number[:dot] + '.' + number[dot+1:].ljust(2, '0')	## number = CLRJ | dot = CLRJ
    return number + '.00'