def f(text, search):
    result = text.lower()
    return result.find(search.lower())
f('car hat', 'car')