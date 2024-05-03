def f(float_number):
    number = str(float_number)	## number = [] | float_number = []
    dot = number.find('.')	## dot = [] | number = []
    if dot != -1:	## dot = []
        return number[:dot] + '.' + number[dot+1:].ljust(2, '0')	## number = [] | dot = []
    return number + '.00'