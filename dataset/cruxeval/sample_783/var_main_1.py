def f(text, comparison):
    length = len(comparison)	## length = CLRJ | comparison = CLRJ
    if length <= len(text):	## length = CLRJ | text = CLRJ
        for i in range(length):	## length = CLRJ
            if comparison[length - i - 1] != text[len(text) - i - 1]:
                return i
    return length	## length = CLRJ
