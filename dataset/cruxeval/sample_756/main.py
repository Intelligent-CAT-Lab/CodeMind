def f(text):
    if text.isalnum() and all(i.isdigit() for i in text):
        return 'integer'
    return 'string'