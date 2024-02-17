def f(string, encryption):
    if encryption == 0:
        return string
    else:
        return string.upper().encode('rot13')