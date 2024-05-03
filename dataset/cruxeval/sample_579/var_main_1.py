def f(text):
    if text.istitle():	## text = CLRJ
        if len(text) > 1 and text.lower() != text:
            return text[0].lower() + text[1:]
    elif text.isalpha():	## text = CLRJ
        return text.capitalize()
    return text	## text = CLRJ
