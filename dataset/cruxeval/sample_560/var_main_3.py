def f(text):
    x = 0	## <state>x = CLRJ</state>
    if text.islower():	## <state>text = CLRJ</state>
        for c in text:
            if int(c) in list(range(90)):
                x+=1
    return x	## <state>x = CLRJ</state>
