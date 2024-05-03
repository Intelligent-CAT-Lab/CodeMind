def f(text):
    uppercase_index = text.find('A')	## uppercase_index = CLRJ | text = CLRJ
    if uppercase_index >= 0:	## uppercase_index = CLRJ
        return text[:uppercase_index] + text[text.find('a') + 1 :]
    else:
        return ''.join(sorted(text))	## text = CLRJ
