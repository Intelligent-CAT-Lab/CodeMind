def f(text, encoding):
    try:
        return text.encode(encoding)
    except LookupError:
        return str(LookupError)