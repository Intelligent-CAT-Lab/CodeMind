def f(text):
    counter = 0	## <state>counter = CLRJ</state>
    for char in text:	## <state>char = CLRJ | text = CLRJ</state>
        if char.isalpha():	## <state>char = CLRJ</state>
            counter += 1	## <state>counter = CLRJ</state>
    return counter	## <state>counter = CLRJ</state>
