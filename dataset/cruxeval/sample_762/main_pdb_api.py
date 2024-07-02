def f(text):
    text = text.lower()
    capitalize = text.capitalize()
    return text[:1] + capitalize[1:]
f('this And cPanel')