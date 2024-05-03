def f(text):
    text = text.upper()	## text = CLRJ
    count_upper = 0	## count_upper = CLRJ
    for char in text:	## char = CLRJ | text = CLRJ
        if char.isupper():	## char = CLRJ
            count_upper += 1	## count_upper = CLRJ
        else:
            return 'no'
    return count_upper // 2	## count_upper = CLRJ
