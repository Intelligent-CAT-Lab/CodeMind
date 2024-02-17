def f(text, size):
    counter = len(text)
    for i in range(size-int(size%2)):
        text = ' '+text+' '
        counter += 2
        if counter >= size:
            return text