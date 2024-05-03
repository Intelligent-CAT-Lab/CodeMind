def f(text, amount):
    length = len(text)	## length = CLRJ | text = CLRJ
    pre_text = '|'	## pre_text = CLRJ
    if amount >= length:	## amount = CLRJ | length = CLRJ
        extra_space = amount - length
        pre_text += ' ' * (extra_space // 2)
        return pre_text + text + pre_text
    return text	## text = CLRJ
