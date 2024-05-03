def f(text):
    index = 1	## index = []
    while index < len(text):	## index = [] | text = []
        if text[index] != text[index - 1]:	## text = [] | index = []
            index += 1	## index = []
        else:
            text1 = text[:index]
            text2 = text[index:].swapcase()
            return text1 + text2
    return text.swapcase()	## text = []
