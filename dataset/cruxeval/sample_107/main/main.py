def f(text):
    result = []
    for i in range(len(text)):
        if not text[i].isascii():
            return False
        elif text[i].isalnum():
            result.append(text[i].upper())
        else:
            result.append(text[i])
    return ''.join(result)