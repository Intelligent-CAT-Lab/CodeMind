def f(n):
    streak = ''
    for c in str(n):
        streak += c.ljust(int(c) * 2)
    return streak