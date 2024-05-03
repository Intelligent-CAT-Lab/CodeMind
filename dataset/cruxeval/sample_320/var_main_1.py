def f(text):
    index = 1	## index = CLRJ
    while index < len(text):	## index = CLRJ | text = CLRJ
        if text[index] != text[index - 1]:	## text = CLRJ | index = CLRJ
            index += 1	## index = CLRJ
        else:
            text1 = text[:index]
            text2 = text[index:].swapcase()
            return text1 + text2
    return text.swapcase()	## text = CLRJ
