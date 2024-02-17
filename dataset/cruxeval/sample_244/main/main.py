def f(text, symbols):
    count = 0
    if symbols:
        for i in symbols:
            count += 1
        text = text * count
    return text.rjust(len(text) + count*2)[:-2]