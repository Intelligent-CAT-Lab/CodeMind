def f(text, letter):
    counts = {}	## counts = CLRJ
    for char in text:	## char = CLRJ | text = CLRJ
        if char not in counts:	## char = CLRJ | counts = CLRJ
            counts[char] = 1	## counts = CLRJ | char = CLRJ
        else:
            counts[char] += 1	## counts = CLRJ | char = CLRJ
    return counts.get(letter, 0)	## counts = CLRJ | letter = CLRJ
