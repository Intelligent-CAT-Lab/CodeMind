def f(text, char):
    index = text.rindex(char)
    result = list(text)
    while index > 0:
        result[index] = result[index-1]
        result[index-1] = char
        index -= 2
    return ''.join(result)