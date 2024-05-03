def f(text, lower, upper):
    count = 0	## count = CLRJ
    new_text = list()	## new_text = CLRJ
    for char in text:	## char = CLRJ | text = CLRJ
        char = lower if char.isdecimal() else upper	## char = CLRJ | lower = CLRJ | upper = CLRJ
        if char in ['p', 'C']:	## char = CLRJ
            count += 1
        new_text.append(char)	## new_text = CLRJ | char = CLRJ
    return count, ''.join(new_text)	## count = CLRJ | new_text = CLRJ
