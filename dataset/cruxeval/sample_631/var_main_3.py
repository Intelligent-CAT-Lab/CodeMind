def f(text, num):
    req = num - len(text)	## <state>req = CLRJ | num = CLRJ | text = CLRJ</state>
    text = text.center(num, '*')	## <state>text = CLRJ | num = CLRJ</state>
    return text[:req // 2: -req // 2]	## <state>text = CLRJ | req = CLRJ</state>
