def f(text):
    new_text = list(text)	## <state>new_text = CLRJ | text = CLRJ</state>
    for i in '+':	## <state>i = CLRJ</state>
        if i in new_text:	## <state>i = CLRJ | new_text = CLRJ</state>
            new_text.remove(i)
    return ''.join(new_text)	## <state>new_text = CLRJ</state>
