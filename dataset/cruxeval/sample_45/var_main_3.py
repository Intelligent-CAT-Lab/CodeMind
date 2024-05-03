def f(text, letter):
    counts = {}	## <state>counts = CLRJ</state>
    for char in text:	## <state>char = CLRJ | text = CLRJ</state>
        if char not in counts:	## <state>char = CLRJ | counts = CLRJ</state>
            counts[char] = 1	## <state>counts = CLRJ | char = CLRJ</state>
        else:
            counts[char] += 1	## <state>counts = CLRJ | char = CLRJ</state>
    return counts.get(letter, 0)	## <state>counts = CLRJ | letter = CLRJ</state>
