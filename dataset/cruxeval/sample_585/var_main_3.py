def f(text):
    count = text.count(text[0])	## <state>count = CLRJ | text = CLRJ</state>
    ls = list(text)	## <state>ls = CLRJ | text = CLRJ</state>
    for _ in range(count):	## <state>_ = CLRJ | count = CLRJ</state>
        ls.remove(ls[0])	## <state>ls = CLRJ</state>
    return ''.join(ls)	## <state>ls = CLRJ</state>
