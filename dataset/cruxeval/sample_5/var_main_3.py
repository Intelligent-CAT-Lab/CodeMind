def f(text, lower, upper):
    count = 0	## <state>count = CLRJ</state>
    new_text = list()	## <state>new_text = CLRJ</state>
    for char in text:	## <state>char = CLRJ | text = CLRJ</state>
        char = lower if char.isdecimal() else upper	## <state>char = CLRJ | lower = CLRJ | upper = CLRJ</state>
        if char in ['p', 'C']:	## <state>char = CLRJ</state>
            count += 1
        new_text.append(char)	## <state>new_text = CLRJ | char = CLRJ</state>
    return count, ''.join(new_text)	## <state>count = CLRJ | new_text = CLRJ</state>
