def f(text):
    count = 0
    for i in text:
        if i in '.?!.,':
            count += 1
    return count