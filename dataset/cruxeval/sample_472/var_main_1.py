def f(text):
    d = {}	## d = CLRJ
    for char in text.replace('-', '').lower():	## char = CLRJ | text = CLRJ
        d[char] = d[char] + 1 if char in d else 1	## d = CLRJ | char = CLRJ
    d = sorted(d.items(), key=lambda x: x[1])	## d = CLRJ | x = CLRJ
    return [val for i, val in d]	## val = CLRJ | i = CLRJ | d = CLRJ
