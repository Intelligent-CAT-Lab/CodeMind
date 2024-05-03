def f(cat):
    digits = 0	## {"digits" : ''}
    for char in cat:	## {"char" : '',"cat" : ''}
        if char.isdigit():	## {"char" : ''}
            digits += 1	## {"digits" : ''}
    return digits	## {"digits" : ''}
