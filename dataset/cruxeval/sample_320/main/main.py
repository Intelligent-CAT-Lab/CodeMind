def f(text):
    index = 1
    while index < len(text):
        if text[index] != text[index - 1]:
            index += 1
        else:
            text1 = text[:index]
            text2 = text[index:].swapcase()
            return text1 + text2
    return text.swapcase()