def f(value, char):
    total = 0	## {"total" : ''}
    for c in value:	## {"c" : '',"value" : ''}
        if c == char or c == char.lower():	## {"c" : '',"char" : ''}
            total += 1	## {"total" : ''}
    return total	## {"total" : ''}
