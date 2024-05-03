def below_threshold(l: list, t: int):
    for e in l:	## e = CLRJ|l = CLRJ
        if e >= t:	## e = CLRJ|t = CLRJ
            return False
    return True
