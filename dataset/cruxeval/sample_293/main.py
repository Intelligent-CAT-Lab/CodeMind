def f(text):
    s = text.lower()
    for i in range(len(s)):
        if s[i] == 'x':
            return 'no'
    return text.isupper()