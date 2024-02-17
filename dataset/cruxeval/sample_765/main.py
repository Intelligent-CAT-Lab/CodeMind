def f(text):
    return sum(1 for c in text if c.isdigit())