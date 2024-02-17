def f(s, ch):
    sl = s
    if ch in s:
        sl = s.lstrip(ch)
        if len(sl) == 0:
            sl = sl + '!?'
    else:
        return 'no'
    return sl