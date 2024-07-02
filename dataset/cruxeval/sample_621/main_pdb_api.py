def f(text, encoding):
    try:
        return text.encode(encoding)
    except LookupError:
        return str(LookupError)
f('13:45:56', 'shift_jis')