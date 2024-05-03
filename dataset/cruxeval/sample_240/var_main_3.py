def f(float_number):
    number = str(float_number)	## <state>number = CLRJ | float_number = CLRJ</state>
    dot = number.find('.')	## <state>dot = CLRJ | number = CLRJ</state>
    if dot != -1:	## <state>dot = CLRJ</state>
        return number[:dot] + '.' + number[dot+1:].ljust(2, '0')	## <state>number = CLRJ | dot = CLRJ</state>
    return number + '.00'