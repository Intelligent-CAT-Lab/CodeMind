def anti_shuffle(s):
    return ' '.join([''.join(sorted(list(i))) for i in s.split(' ')])	## i = CLRJ|s = CLRJ
