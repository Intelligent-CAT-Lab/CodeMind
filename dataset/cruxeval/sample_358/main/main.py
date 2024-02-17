def f(text, value):
    indexes = []
    for i in range(len(text)):
        if text[i] == value and (i == 0 or text[i-1] != value):
            indexes.append(i) 
    if len(indexes) % 2 == 1:
        return text
    return text[indexes[0]+1:indexes[-1]]