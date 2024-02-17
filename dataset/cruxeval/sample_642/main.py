def f(text):
    i = 0
    while i < len(text) and text[i].isspace():
        i+=1
    if i == len(text):
        return 'space'
    return 'no'