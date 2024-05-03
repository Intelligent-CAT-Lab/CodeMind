def f(text, changes):
    result = ''	## result = []
    count = 0	## count = []
    changes = list(changes)	## changes = []
    for char in text:	## char = [] | text = []
        result += char if char in 'e' else changes[count % len(changes)]	## result = [] | char = [] | changes = [] | count = []
        count += (1 if char not in 'e' else 0)	## count = [] | char = []
    return result	## result = []
