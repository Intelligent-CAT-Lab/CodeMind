float_number = 3.121
number = str(float_number)
dot = number.find('.')
if dot != -1:
    print(number[:dot] + '.' + number[dot+1:].ljust(2, '0'))
print(number + '.00')