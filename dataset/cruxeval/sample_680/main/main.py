def f(text):
    letters = ''
    for i in range(len(text)):
        if text[i].isalnum():
            letters += text[i]
    return letters