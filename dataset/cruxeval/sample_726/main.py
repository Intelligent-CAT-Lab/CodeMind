def f(text):
    ws = 0
    for s in text:
        if s.isspace():
            ws += 1
    return ws, len(text)