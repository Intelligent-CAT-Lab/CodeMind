def f(input):
    for char in input:	## char = CLRJ | input = CLRJ
        if char.isupper():	## char = CLRJ
            return False
    return True