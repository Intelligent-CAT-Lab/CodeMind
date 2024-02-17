def f(s, ch):
    if ch not in s:
        return ''
    s = s.partition(ch)[2][::-1]
    for i in range(len(s)):
        s = s.partition(ch)[2][::-1]
    return s