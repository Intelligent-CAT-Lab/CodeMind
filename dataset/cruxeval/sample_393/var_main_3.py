def f(text):
    ls = text[::-1]	## <state>ls = CLRJ | text = CLRJ</state>
    text2 = ''	## <state>text2 = CLRJ</state>
    for i in range(len(ls) - 3, 0, -3):	## <state>i = CLRJ | ls = CLRJ</state>
        text2 += '---'.join(ls[i:i + 3]) + '---'	## <state>text2 = CLRJ | ls = CLRJ | i = CLRJ</state>
    return text2[:-3]	## <state>text2 = CLRJ</state>
