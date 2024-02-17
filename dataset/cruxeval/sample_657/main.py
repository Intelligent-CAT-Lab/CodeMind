def f(text):
    for punct in '!.?,:;':
        if text.count(punct) > 1:
            return 'no'
        if text.endswith(punct):
            return 'no'
    return text.title()