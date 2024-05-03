def f(text):
    if text.istitle():	## text = []
        if len(text) > 1 and text.lower() != text:
            return text[0].lower() + text[1:]
    elif text.isalpha():	## text = []
        return text.capitalize()
    return text	## text = []
