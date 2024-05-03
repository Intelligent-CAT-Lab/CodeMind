def f(text):
    uppercase_index = text.find('A')	## uppercase_index = [] | text = []
    if uppercase_index >= 0:	## uppercase_index = []
        return text[:uppercase_index] + text[text.find('a') + 1 :]
    else:
        return ''.join(sorted(text))	## text = []
