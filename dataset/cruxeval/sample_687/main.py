def f(text):
    t = list(text)
    t.pop(len(t) // 2)
    t.append(text.lower())
    return ':'.join([c for c in t])