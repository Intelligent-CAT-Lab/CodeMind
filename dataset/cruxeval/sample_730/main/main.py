def f(text):
    m = 0
    cnt = 0
    for i in text.split():
        if len(i) > m:
            cnt += 1
            m = len(i)
    return cnt