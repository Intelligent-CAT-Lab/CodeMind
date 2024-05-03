def f(text, size):
    counter = len(text)	## <state>counter = CLRJ | text = CLRJ</state>
    for i in range(size-int(size%2)):	## <state>i = CLRJ | size = CLRJ</state>
        text = ' '+text+' '	## <state>text = CLRJ</state>
        counter += 2	## <state>counter = CLRJ</state>
        if counter >= size:	## <state>counter = CLRJ | size = CLRJ</state>
            return text	## <state>text = CLRJ</state>
