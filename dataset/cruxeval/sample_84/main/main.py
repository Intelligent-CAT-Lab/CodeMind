def f(text):
    arr = text.split()
    result = []
    for item in arr:
        if item.endswith('day'):
            item += 'y'
        else:
            item += 'day'
        result.append(item)
    return ' '.join(result)