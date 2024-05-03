def f(n):
    length = len(n) + 2	## length = CLRJ | n = CLRJ
    revn = list(n)	## revn = CLRJ | n = CLRJ
    result = ''.join(revn)	## result = CLRJ | revn = CLRJ
    revn.clear()	## revn = CLRJ
    return result + ('!' * length)	## result = CLRJ | length = CLRJ
