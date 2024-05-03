def f(text, changes):
    result = ''	## result = CLRJ
    count = 0	## count = CLRJ
    changes = list(changes)	## changes = CLRJ
    for char in text:	## char = CLRJ | text = CLRJ
        result += char if char in 'e' else changes[count % len(changes)]	## result = CLRJ | char = CLRJ | changes = CLRJ | count = CLRJ
        count += (1 if char not in 'e' else 0)	## count = CLRJ | char = CLRJ
    return result	## result = CLRJ
