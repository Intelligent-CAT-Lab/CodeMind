def f(text, char1, char2):
    t1a = []
    t2a = []
    for i in range(len(char1)):
        t1a.append(char1[i])
        t2a.append(char2[i])
    t1 = text.maketrans(dict(zip(t1a, t2a)))
    return text.translate(t1)