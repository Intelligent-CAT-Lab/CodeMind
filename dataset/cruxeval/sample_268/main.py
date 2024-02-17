def f(s, separator):
    for i in range(len(s)):
        if s[i] == separator:
            new_s = list(s)
            new_s[i] = '/'
            return ' '.join(new_s)