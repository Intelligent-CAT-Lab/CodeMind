def f(text, changes):
    result = ''	## <state>result = CLRJ</state>
    count = 0	## <state>count = CLRJ</state>
    changes = list(changes)	## <state>changes = CLRJ</state>
    for char in text:	## <state>char = CLRJ | text = CLRJ</state>
        result += char if char in 'e' else changes[count % len(changes)]	## <state>result = CLRJ | char = CLRJ | changes = CLRJ | count = CLRJ</state>
        count += (1 if char not in 'e' else 0)	## <state>count = CLRJ | char = CLRJ</state>
    return result	## <state>result = CLRJ</state>
