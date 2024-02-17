def f(text, length):
    length = -length if length < 0 else length
    output = ''
    for idx in range(length):
        if text[idx % len(text)] != ' ':
            output += text[idx % len(text)]
        else:
            break
    return output