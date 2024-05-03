def f(text, char):
    count = text.count(char)	## <state>count = CLRJ | text = CLRJ | char = CLRJ</state>
    chars = list(text)	## <state>chars = CLRJ | text = CLRJ</state>
    if count > 0:	## <state>count = CLRJ</state>
        index = chars.index(char) + 1	## <state>index = CLRJ | chars = CLRJ | char = CLRJ</state>
        chars[:index:index+1] = [c for c in chars[index:index+count:1]]	## <state>chars = CLRJ | index = CLRJ | c = CLRJ | count = CLRJ</state>
    return ''.join(chars)	## <state>chars = CLRJ</state>
