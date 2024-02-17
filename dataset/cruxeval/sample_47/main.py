def f(text):
    length = len(text)
    half = length // 2
    encode = text[:half].encode('ascii')
    if text[half:] == encode.decode():
        return True
    else:
        return False