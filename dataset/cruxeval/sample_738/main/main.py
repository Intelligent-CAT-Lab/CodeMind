def f(text, characters):
    for i in range(len(characters)):
        text = text.rstrip(characters[i::len(characters)])
    return text