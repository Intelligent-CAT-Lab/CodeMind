def f(text):
    number = 0
    for t in text:
        if t.isnumeric():
            number += 1
    return number