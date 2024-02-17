def f(sentence):
    ls = list(sentence)
    for letter in ls:
        if not letter.istitle():
            ls.remove(letter)
    return ''.join(ls)