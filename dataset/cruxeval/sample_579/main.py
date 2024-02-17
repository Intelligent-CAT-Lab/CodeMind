def f(text):
    if text.istitle():
        if len(text) > 1 and text.lower() != text:
            return text[0].lower() + text[1:]
    elif text.isalpha():
        return text.capitalize()
    return text