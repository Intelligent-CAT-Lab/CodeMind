def f(bots):
    clean = []
    for username in bots:
        if not username.isupper():
            clean.append(username[:2] + username[-3:])
    return len(clean)
f(['yR?TAJhIW?n', 'o11BgEFDfoe', 'KnHdn2vdEd', 'wvwruuqfhXbGis'])