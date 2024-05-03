def f(text):
    d = {}	## <state>d = CLRJ</state>
    for char in text.replace('-', '').lower():	## <state>char = CLRJ | text = CLRJ</state>
        d[char] = d[char] + 1 if char in d else 1	## <state>d = CLRJ | char = CLRJ</state>
    d = sorted(d.items(), key=lambda x: x[1])	## <state>d = CLRJ | x = CLRJ</state>
    return [val for i, val in d]	## <state>val = CLRJ | i = CLRJ | d = CLRJ</state>
