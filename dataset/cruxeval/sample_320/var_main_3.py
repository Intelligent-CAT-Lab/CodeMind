def f(text):
    index = 1	## <state>index = CLRJ</state>
    while index < len(text):	## <state>index = CLRJ | text = CLRJ</state>
        if text[index] != text[index - 1]:	## <state>text = CLRJ | index = CLRJ</state>
            index += 1	## <state>index = CLRJ</state>
        else:
            text1 = text[:index]
            text2 = text[index:].swapcase()
            return text1 + text2
    return text.swapcase()	## <state>text = CLRJ</state>
