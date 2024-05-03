def monotonic(l: list):
    if l == sorted(l) or l == sorted(l, reverse=True):	## l = CLRJ
        return True
    return False
