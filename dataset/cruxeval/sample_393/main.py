def f(text):
    ls = text[::-1]
    text2 = ''
    for i in range(len(ls) - 3, 0, -3):
        text2 += '---'.join(ls[i:i + 3]) + '---'
    return text2[:-3]