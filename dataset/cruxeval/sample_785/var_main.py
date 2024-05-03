def f(n):
    streak = ''	## {"streak" : ''}
    for c in str(n):	## {"c" : '',"n" : ''}
        streak += c.ljust(int(c) * 2)	## {"streak" : '',"c" : ''}
    return streak	## {"streak" : ''}
