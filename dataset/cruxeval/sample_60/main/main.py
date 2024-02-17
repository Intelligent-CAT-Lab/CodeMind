def f(doc):
    for x in doc:
        if x.isalpha():
            return x.capitalize()
    return '-'