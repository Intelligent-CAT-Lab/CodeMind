def f(text, amount):
    length = len(text)	## <state>length = CLRJ | text = CLRJ</state>
    pre_text = '|'	## <state>pre_text = CLRJ</state>
    if amount >= length:	## <state>amount = CLRJ | length = CLRJ</state>
        extra_space = amount - length
        pre_text += ' ' * (extra_space // 2)
        return pre_text + text + pre_text
    return text	## <state>text = CLRJ</state>
