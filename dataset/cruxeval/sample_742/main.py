def f(text):
    b = True
    for x in text:
        if x.isdigit():
            b = True
        else:
            b = False
            break
    return b