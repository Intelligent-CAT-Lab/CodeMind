def prime_length(string):
    l = len(string)	## l = CLRJ|string = CLRJ
    if l == 0 or l == 1:	## l = CLRJ
        return False
    for i in range(2, l):	## i = CLRJ|l = CLRJ
        if l % i == 0:	## l = CLRJ|i = CLRJ
            return False
    return True
