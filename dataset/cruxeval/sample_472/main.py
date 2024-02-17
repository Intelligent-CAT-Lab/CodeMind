def f(text):
    d = {}
    for char in text.replace('-', '').lower():
        d[char] = d[char] + 1 if char in d else 1
    d = sorted(d.items(), key=lambda x: x[1])
    return [val for i, val in d]