def f(text):
    letters = ''	## <state>letters = CLRJ</state>
    for i in range(len(text)):	## <state>i = CLRJ | text = CLRJ</state>
        if text[i].isalnum():	## <state>text = CLRJ | i = CLRJ</state>
            letters += text[i]	## <state>letters = CLRJ | text = CLRJ | i = CLRJ</state>
    return letters	## <state>letters = CLRJ</state>
