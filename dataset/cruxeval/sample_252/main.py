def f(text, char):
    if char in text:
        if not text.startswith(char):
            text = text.replace(char,'')
    return text