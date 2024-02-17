def f(float_number):
    number = str(float_number)
    dot = number.find('.')
    if dot != -1:
        return number[:dot] + '.' + number[dot+1:].ljust(2, '0')
    return number + '.00'