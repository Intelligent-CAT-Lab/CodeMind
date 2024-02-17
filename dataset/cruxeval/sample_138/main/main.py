def f(text, chars):
    listchars = list(chars)
    first = listchars.pop()
    for i in listchars:
        text = text[0:text.find(i)]+i+text[text.find(i)+1:]
    return text