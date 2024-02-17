def f(text):
    for i in range(len(text)):
        if text[i] == text[i].upper() and text[i-1].islower():
            return True
    return False