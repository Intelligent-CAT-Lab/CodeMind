def count_upper(s):
    count = 0	## count = CLRJ
    for i in range(0,len(s),2):	## i = CLRJ|s = CLRJ
        if s[i] in "AEIOU":	## s = CLRJ|i = CLRJ
            count += 1	## count = CLRJ
    return count	## count = CLRJ
