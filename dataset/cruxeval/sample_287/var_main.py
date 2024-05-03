def f(name):
    if name.islower():	## {"name" : ''}
        name = name.upper()
    else:
        name = name.lower()	## {"name" : ''}
    return name	## {"name" : ''}
